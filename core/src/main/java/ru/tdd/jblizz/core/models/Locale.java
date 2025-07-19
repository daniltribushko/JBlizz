package ru.tdd.jblizz.core.models;

/**
 * Перечисление локализаций данных BattleNet.
 * Локализация влияет на язык, на котором будут получены данные от BattleNet
 * @author Tribushko Danil
 * @see <a href=https://develop.battle.net/documentation/guides/game-data-apis>Game Data APIs</a>
 * @since 19.07.2025
 */
public enum Locale {
    /**
     * Английский (США)
     */
    US("en_US"),

    /**
     * Мексиканский язык
     */
    MX("es_MX"),

    /**
     * Португальский (Бразилия) язык
     */
    BR("pt_BR"),

    /**
     * Немецкий язык
     */
    DE("de_DE"),

    /**
     * Английский язык
     */
    GB("en_GB"),

    /**
     * Испанский язык
     */
    ES("es_ES"),

    /**
     * Французский язык
     */
    FR("fr_FR"),

    /**
     * Итальянский язык
     */
    IT("it_IT"),

    /**
     * Русский язык
     */
    RU("ru_RU"),

    /**
     * Корейский язык
     */
    KR("ko_KR"),

    /**
     * Китайский язык (Тайвань)
     */
    TW("zh_TW"),

    /**
     * Китайский язык
     */
    CN("zh_CN");

    // Код локализации
    private final String code;

    Locale(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
