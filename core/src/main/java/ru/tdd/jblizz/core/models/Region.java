package ru.tdd.jblizz.core.models;

/**
 * Перечисление регионов серверов BattleNet.
 * Регион влияет на набор получаемых данных и базовый url адреса
 * @author Tribushko Danil
 * @see <a href=https://develop.battle.net/documentation/guides/regionality-and-apis>Battle.net Regionality and APIs</a>
 * @since 19.07.2025
 */
public enum Region {
    /**
     * Китайский регион
     * Базовый url: {@code gateway.battlenet.com.cn}
     */
    CN("cn"),

    /**
     * Американский регион
     * Базовый url: {@code us.api.blizzard.com}
     */
    US("us"),

    /**
     * Европейский регион
     * Базовый url: {@code eu.api.blizzard.com}
     */
    EU("eu"),

    /**
     * Китайский регион
     * Базовый url: {@code kr.api.blizzard.com}
     */
    KR("kr"),

    /**
     * Тайванский регион
     * Базовый url: {@code tw.api.blizzard.com}
     */
    TW("tw");

    private final String name;

    Region(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
