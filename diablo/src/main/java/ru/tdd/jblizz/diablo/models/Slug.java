package ru.tdd.jblizz.diablo.models;

/**
 * Интерфейс для перечислений, который описывает строковой идентификатор
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public interface Slug {
    String name();

    default String getSlug() {
        return name().toLowerCase().replace("_", "-");
    };
}
