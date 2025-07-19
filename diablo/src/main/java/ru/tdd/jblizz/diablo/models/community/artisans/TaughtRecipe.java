package ru.tdd.jblizz.diablo.models.community.artisans;

import java.util.List;

/**
 * Рецепт, который необходимо изучить
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class TaughtRecipe {
    private String id;
    private String slug;
    private String name;
    private Integer cost;
    private List<Reagent> reagents;

    public TaughtRecipe(String id, String slug, String name, Integer cost, List<Reagent> reagents) {
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.cost = cost;
        this.reagents = reagents;
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

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public List<Reagent> getReagents() {
        return reagents;
    }

    public void setReagents(List<Reagent> reagents) {
        this.reagents = reagents;
    }
}
