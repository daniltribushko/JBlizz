package ru.tdd.jblizz.core.http.clients.auth;

import com.google.gson.GsonBuilder;
import okhttp3.*;
import ru.tdd.jblizz.core.exceptions.BattleNetApiException;
import ru.tdd.jblizz.core.http.Paths;
import ru.tdd.jblizz.core.models.TokenResponse;
import ru.tdd.jblizz.core.utils.HttpUtils;

import java.io.IOException;

/**
 * Клиент для отправки запроса на получение jwt токена доступа к api Battle.net
 * @author Tribushko Danil
 * @see <a href=https://develop.battle.net/documentation/guides/using-oauth/client-credentials-flow>Battle.net Client Credentials Flow</a>
 * @since 19.07.2025
 */
public final class AuthClient {
    // Идентификатор приложения Battle.net
    private final String clientId;
    // Пароль приложения Battle.net
    private final String clientSecret;

    /**
     * Создает клиент для получение jwt токена-доступа
     * @param clientId идентификатор приложения (не может быть null)
     * @param clientSecret пароль приложегтя (не может быть null)
     * @throws IllegalArgumentException если clientId или clientSecret - null
     */
    public AuthClient(String clientId, String clientSecret) {
        if (clientId == null || clientSecret == null) {
            throw new IllegalArgumentException("clientId and clientSecret cannot be null");
        }
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * Отправка запроса на получение jwt токена-доступа
     * @return Jwt токен доступа
     * @see TokenResponse
     */
    public TokenResponse token() {
        String credentialsBytes = HttpUtils.getBasicCredentials(clientId, clientSecret);
        RequestBody formBody = new FormBody.Builder()
                .add("grant_type", "client_credentials")
                .build();

        Request request = new Request.Builder()
                .url(HttpUtils.HTTPS_PREFIX + Paths.Auth.TOKEN)
                .header("Authorization", HttpUtils.BASIC_AUTH_PREFIX + " " + credentialsBytes)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .post(formBody)
                .build();

        try (Response response = new OkHttpClient().newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null) {
                return new GsonBuilder().create().fromJson(response.body().string(), TokenResponse.class);
            } else {
                if (response.body() != null) {
                    throw new BattleNetApiException(response.code(), response.body().string());
                } else {
                    throw new BattleNetApiException(response.code(), response.message());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
