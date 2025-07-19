package ru.tdd.jblizz.diablo.models.community.skills;

import java.util.List;

/**
 * Содержит данные навыка с рунами
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class SkillWithRunes {
    private Skill skill;
    private List<Rune> runes;

    public SkillWithRunes(Skill skill, List<Rune> runes) {
        this.skill = skill;
        this.runes = runes;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public List<Rune> getRunes() {
        return runes;
    }

    public void setRunes(List<Rune> runes) {
        this.runes = runes;
    }
}
