package ru.tdd.jblizz.core.http.clients;

import ru.tdd.jblizz.core.http.Paths;
import ru.tdd.jblizz.core.models.Locale;
import ru.tdd.jblizz.core.models.Region;
import ru.tdd.jblizz.core.utils.HttpUtils;

/**
 * Базовый клиент для отправки запросов к BattleNet Api
 *
 * @author Tribushko Danil
 * @see <a href="https://develop.battle.net/documentation">Battle.net API Docs</a>
 * @since 19.07.2025
 */
public abstract class BattleNetApiClient {
    /**
     * JWT-токен для аутентификации в API.
     *
     * @see <a href="https://develop.battle.net/documentation/guides/using-oauth">Battle.net OAuth</a>
     */
    protected String token;

    /**
     * Регион сервера BattleNet
     *
     * @see Region
     */
    protected Region region;

    /**
     * Локализация для получаемых данных
     *
     * @see Locale
     */
    protected Locale locale;

    /**
     * Базовый URL API. Формируется автоматически на основе региона.
     * Пример для EU: {@code https://eu.api.blizzard.com}
     */
    protected String url;

    /**
     * Создает клиент с указанными параметрами.
     *
     * @param token  JWT-токен доступа (не может быть null).
     * @param region Регион серверов Battle.net (не может быть null),
     *               для китайского региона нужен jwt токен аккаунта зарегестрированного на китайском сервере.
     * @param locale Локализация данных (не может быть null).
     * @throws IllegalArgumentException если region или locale — null.
     */
    public BattleNetApiClient(String token, Region region, Locale locale) {
        if (token == null || region == null || locale == null) {
            throw new IllegalArgumentException("Token and region and locale must not be null");
        }

        this.url = region == Region.CN ?
                HttpUtils.HTTPS_PREFIX + Paths.BASE_CN_URL :
                HttpUtils.HTTPS_PREFIX + region.getName() + "." + Paths.BASE_URL;
        this.region = region;
        this.token = token;
        this.locale = locale;
    }
}
