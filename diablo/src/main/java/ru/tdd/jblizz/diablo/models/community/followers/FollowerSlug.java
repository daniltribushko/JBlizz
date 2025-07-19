package ru.tdd.jblizz.diablo.models.community.followers;

import ru.tdd.jblizz.diablo.models.Slug;

/**
 * Содержит набор идентификаторов спутников персонажа
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public enum FollowerSlug implements Slug {
    /**
     * Негодяй
     */
    SCOUNDREL,

    /**
     * Храмовник
     */
    TEMPLAR,

    /**
     * Заклинательница
     */
    ENCHANTRESS
}
