package ru.tdd.jblizz.diablo.models.community.items;

import ru.tdd.jblizz.diablo.models.TextHtml;

import java.util.List;

/**
 * Случайный бонус предмета
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class RandomAffix {
    private List<TextHtml> oneOf;

    public RandomAffix(List<TextHtml> oneOf) {
        this.oneOf = oneOf;
    }

    public List<TextHtml> getOneOf() {
        return oneOf;
    }

    public void setOneOf(List<TextHtml> oneOf) {
        this.oneOf = oneOf;
    }
}
