package ru.tdd.jblizz.diablo.models.community.acts;

import java.util.List;

/**
 * Содержит список игровых актов
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class Acts {
    private List<Act> acts;

    public Acts(List<Act> acts) {
        this.acts = acts;
    }

    public List<Act> getActs() {
        return acts;
    }

    public void setActs(List<Act> acts) {
        this.acts = acts;
    }
}
