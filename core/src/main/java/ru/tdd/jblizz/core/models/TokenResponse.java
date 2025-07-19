package ru.tdd.jblizz.core.models;

import com.google.gson.annotations.SerializedName;

/**
 * Модель ответа Oauth 2.0 от Battle.net api
 * <p>
 * Содержит данные для авторизации в Battle.net api
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class TokenResponse {
    @SerializedName(value = "access_token")
    private String accessToken;

    @SerializedName(value = "token_type")
    private String tokenType;

    @SerializedName(value = "expires+in")
    private Long expiresIn;

    private String sub;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public Long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }
}
