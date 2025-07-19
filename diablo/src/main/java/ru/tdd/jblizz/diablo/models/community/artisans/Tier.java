package ru.tdd.jblizz.diablo.models.community.artisans;

import java.util.List;

/**
 * Уровень предметов ремесленника
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class Tier {
    private Integer tier;
    private List<TrainedRecipe> trainedRecipes;
    private List<TaughtRecipe> taughtRecipes;

    public Tier(Integer tier, List<TrainedRecipe> trainedRecipes, List<TaughtRecipe> taughtRecipes) {
        this.tier = tier;
        this.trainedRecipes = trainedRecipes;
        this.taughtRecipes = taughtRecipes;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public List<TrainedRecipe> getTrainedRecipes() {
        return trainedRecipes;
    }

    public void setTrainedRecipes(List<TrainedRecipe> trainedRecipes) {
        this.trainedRecipes = trainedRecipes;
    }

    public List<TaughtRecipe> getTaughtRecipes() {
        return taughtRecipes;
    }

    public void setTaughtRecipes(List<TaughtRecipe> taughtRecipes) {
        this.taughtRecipes = taughtRecipes;
    }
}
