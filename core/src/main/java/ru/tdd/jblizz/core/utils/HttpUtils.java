package ru.tdd.jblizz.core.utils;

import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import ru.tdd.jblizz.core.exceptions.BattleNetApiException;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Base64;

/**
 * Утилитный класс для работы с Http запросами
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class HttpUtils {
    /**
     * Префикс для https url адресов
     */
    public static final String HTTPS_PREFIX = "https://";

    /**
     * Префикс для заголовка Basic авторизации
     */
    public static final String BASIC_AUTH_PREFIX = "Basic";

    /**
     * Префикс для заголовка Bearer авторизации
     */
    public static final String BEARER_AUTH_HEADER = "Bearer";

    /**
     * Создает закодированную строку в формате Base64 с данными для авторизации
     * @param clientId имя для авторизации
     * @param clientSecret пароль для авторизации
     * @return закодированную строку в формате Base64
     */
    public static String getBasicCredentials(String clientId, String clientSecret) {
        String credentials = clientId + ":" + clientSecret;
        return Base64.getEncoder().encodeToString(credentials.getBytes());
    }

    /**
     * Получает ответа на http запрос в виде указанного объекта
     * @param request http запрос
     * @param clazz тип объекта, в который будет преобразован json ответ
     * @return объект указанного типа, полученного из JSON
     * @param <T> тип объекта для преобразования JSON
     * @throws BattleNetApiException ошибка со строны сервера Battle.net
     * @throws RuntimeException ошибка при вводе-выводе данных
     */
    public static <T> T getResponse(Request request, Type clazz) {
        try (Response response = new OkHttpClient().newCall(request).execute()) {
            ResponseBody body = response.body();
            int code = response.code();
            if (response.isSuccessful() && body != null) {
                return new GsonBuilder().create().fromJson(body.string(), clazz);
            } else {
                if (body != null) {
                    throw new BattleNetApiException(code, body.string());
                } else {
                    throw new BattleNetApiException(code, response.message());
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
