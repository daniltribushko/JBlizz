package ru.tdd.jblizz.diablo.models.community.artisans;

/**
 * Содержит данные ремесленника
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class Artisan {
    private String slug;
    private String name;
    private String portrait;
    private Training training;

    public Artisan(String slug, String name, String portrait, Training training) {
        this.slug = slug;
        this.name = name;
        this.portrait = portrait;
        this.training = training;
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

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }
}
