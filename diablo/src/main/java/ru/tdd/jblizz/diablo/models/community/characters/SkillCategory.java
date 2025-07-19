package ru.tdd.jblizz.diablo.models.community.characters;

/**
 * Содержит данные категории навыка
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class SkillCategory {
    private String slug;
    private String name;

    public SkillCategory(String slug, String name) {
        this.slug = slug;
        this.name = name;
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
}
