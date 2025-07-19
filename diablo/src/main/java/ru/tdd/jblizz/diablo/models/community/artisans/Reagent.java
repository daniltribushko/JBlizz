package ru.tdd.jblizz.diablo.models.community.artisans;

/**
 * Содержит реагент для рецепта
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class Reagent {
    private Integer quantity;
    private ReagentItem item;

    public Reagent(Integer quantity, ReagentItem item) {
        this.quantity = quantity;
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public ReagentItem getItem() {
        return item;
    }

    public void setItem(ReagentItem item) {
        this.item = item;
    }
}
