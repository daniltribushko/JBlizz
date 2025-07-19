package ru.tdd.jblizz.diablo.models.community.artisans;

/**
 * Предмет созданного при помощи рецепта
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class ItemProduce {
    private String id;
    private String slug;
    private String name;
    private String icon;
    private String path;

    public ItemProduce(String id, String slug, String name, String icon, String path) {
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.icon = icon;
        this.path = path;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
