package ru.tdd.jblizz.diablo.models.community.followers;

import ru.tdd.jblizz.diablo.models.community.skills.Skill;

import java.util.List;

/**
 * Содержит данные спутника персонажа
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class Follower {
    private String slug;
    private String name;
    private String realName;
    private String portrait;
    private List<Skill> skills;

    public Follower(String slug, String name, String realName, String portrait, List<Skill> skills) {
        this.slug = slug;
        this.name = name;
        this.realName = realName;
        this.portrait = portrait;
        this.skills = skills;
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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
