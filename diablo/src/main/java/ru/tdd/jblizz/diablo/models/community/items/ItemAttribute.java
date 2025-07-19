package ru.tdd.jblizz.diablo.models.community.items;

import ru.tdd.jblizz.diablo.models.TextHtml;

import java.util.List;

/**
 * Бонусы от предмета
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class ItemAttribute {
    private List<TextHtml> primary;
    private List<TextHtml> secondary;

    public ItemAttribute(List<TextHtml> primary, List<TextHtml> secondary) {
        this.primary = primary;
        this.secondary = secondary;
    }

    public List<TextHtml> getPrimary() {
        return primary;
    }

    public void setPrimary(List<TextHtml> primary) {
        this.primary = primary;
    }

    public List<TextHtml> getSecondary() {
        return secondary;
    }

    public void setSecondary(List<TextHtml> secondary) {
        this.secondary = secondary;
    }
}
