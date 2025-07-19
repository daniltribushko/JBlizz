package ru.tdd.jblizz.diablo.models.community.artisans;

import java.util.List;

/**
 * Содержит уровни предметов
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class Training {
    public List<Tier> tiers;

    public Training(List<Tier> tiers) {
        this.tiers = tiers;
    }

    public List<Tier> getTiers() {
        return tiers;
    }

    public void setTiers(List<Tier> tiers) {
        this.tiers = tiers;
    }
}
