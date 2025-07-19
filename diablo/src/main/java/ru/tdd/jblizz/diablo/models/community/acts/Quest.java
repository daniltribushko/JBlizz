package ru.tdd.jblizz.diablo.models.community.acts;

/**
 * Содержит данные квеста игрового акта
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class Quest {
    private Long id;

    private String name;

    private String slug;

    public Quest(Long id, String name, String slug) {
        this.id = id;
        this.name = name;
        this.slug = slug;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}
