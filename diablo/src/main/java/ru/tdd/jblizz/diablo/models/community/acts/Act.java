package ru.tdd.jblizz.diablo.models.community.acts;

import java.util.List;

/**
 * Содержит данные игрового акта
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class Act {
    private String slug;
    private Integer number;
    private String name;
    private List<Quest> quests;

    public Act(String slug, Integer number, String name, List<Quest> quests) {
        this.slug = slug;
        this.number = number;
        this.name = name;
        this.quests = quests;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Quest> getQuests() {
        return quests;
    }

    public void setQuests(List<Quest> quests) {
        this.quests = quests;
    }
}
