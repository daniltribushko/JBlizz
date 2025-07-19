package ru.tdd.jblizz.core.http;

/**
 * Класс для хранения частей url путей для отправки запросов к Battle.net api
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class Paths {
    // Базовы путь адреса для отправки запросов для всех регионов кроме Китая
    public static final String BASE_URL = "api.blizzard.com";

    // Базовый путь адреса для отправки запросов для китайского региона
    public static final String BASE_CN_URL = "gateway.battlenet.com.cn";

    /**
     * Класс для хранения частей url путей для отправки запросов на авторизацию в Battle.net api
     * @author Tribushko Danil
     * @since 19.07.2025
     */
    public static class Auth {
        public static final String TOKEN = "oauth.battle.net/token";
    }
}
