package ru.tdd.jblizz.diablo.models.community.artisans;

import java.util.List;

/**
 * Доступные по умолчанию предметы у ремесленника
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class TrainedRecipe {
    private String id;
    private String slug;
    private String name;
    private Long cost;
    private List<Reagent> reagents;
    private ItemProduce itemProduced;

    public TrainedRecipe(String id, String slug, String name, Long cost, List<Reagent> reagents, ItemProduce itemProduced) {
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.cost = cost;
        this.reagents = reagents;
        this.itemProduced = itemProduced;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCost() {
        return cost;
    }

    public void setCost(Long cost) {
        this.cost = cost;
    }

    public List<Reagent> getReagents() {
        return reagents;
    }

    public void setReagents(List<Reagent> reagents) {
        this.reagents = reagents;
    }

    public ItemProduce getItemProduced() {
        return itemProduced;
    }

    public void setItemProduced(ItemProduce itemProduced) {
        this.itemProduced = itemProduced;
    }
}
