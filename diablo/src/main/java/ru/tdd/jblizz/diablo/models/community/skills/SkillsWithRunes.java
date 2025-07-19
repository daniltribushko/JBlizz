package ru.tdd.jblizz.diablo.models.community.skills;

import java.util.List;

/**
 * Содержит список навыков с рунами
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class SkillsWithRunes {
    private List<SkillWithRune> active;

    public SkillsWithRunes(List<SkillWithRune> active) {
        this.active = active;
    }

    public List<SkillWithRune> getActive() {
        return active;
    }

    public void setActive(List<SkillWithRune> active) {
        this.active = active;
    }
}
