package ru.tdd.jblizz.diablo.models.community.skills;

/**
 * одержит данные навыка
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class Skill {
    private String slug;
    private String name;
    private String icon;
    private Integer level;
    private String tooltipUrl;
    private String description;
    private String descriptionHtml;

    public Skill(String slug, String name, String icon, Integer level, String tooltipUrl, String description, String descriptionHtml) {
        this.slug = slug;
        this.name = name;
        this.icon = icon;
        this.level = level;
        this.tooltipUrl = tooltipUrl;
        this.description = description;
        this.descriptionHtml = descriptionHtml;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getTooltipUrl() {
        return tooltipUrl;
    }

    public void setTooltipUrl(String tooltipUrl) {
        this.tooltipUrl = tooltipUrl;
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
