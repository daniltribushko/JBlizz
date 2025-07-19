package ru.tdd.jblizz.diablo.models.community.skills;

/**
 * Содержит данные навыка с руной
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class SkillWithRune {
    private Skill skill;
    private Rune rune;

    public SkillWithRune(Skill skill, Rune rune) {
        this.skill = skill;
        this.rune = rune;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Rune getRune() {
        return rune;
    }

    public void setRune(Rune rune) {
        this.rune = rune;
    }
}
