package ru.tdd.jblizz.core.exceptions;

/**
 * Исключение, которое выбрасывается со строны клиента Battle.net
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class BattleNetApiException extends RuntimeException {
    // Http код ошибки
    private int statusCode;

    public BattleNetApiException(int statusCode, String message) {
        super(statusCode + " - " +message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
