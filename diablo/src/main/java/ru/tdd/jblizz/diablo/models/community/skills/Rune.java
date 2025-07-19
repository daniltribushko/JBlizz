package ru.tdd.jblizz.diablo.models.community.skills;

/**
 * Содержит данные руны навыка
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class Rune {
    private String slug;
    private String type;
    private String name;
    private Integer level;
    private String description;
    private String descriptionHtml;

    public Rune(String slug, String type, String name, Integer level, String description, String descriptionHtml) {
        this.slug = slug;
        this.type = type;
        this.name = name;
        this.level = level;
        this.description = description;
        this.descriptionHtml = descriptionHtml;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescriptionHtml() {
        return descriptionHtml;
    }

    public void setDescriptionHtml(String descriptionHtml) {
        this.descriptionHtml = descriptionHtml;
    }
}
