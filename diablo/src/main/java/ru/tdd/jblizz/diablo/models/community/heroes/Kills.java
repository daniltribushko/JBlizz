package ru.tdd.jblizz.diablo.models.community.heroes;

/**
 * Содержит данные об количестве убитых персонажем монстров
 * @author Tribushko Danil
 * @since 19.07.205
 */
public final class Kills {
    private Long monsters;
    private Long elites;
    private Long hardcoreMonsters;

    public Kills(Long monsters, Long elites, Long hardcoreMonsters) {
        this.monsters = monsters;
        this.elites = elites;
        this.hardcoreMonsters = hardcoreMonsters;
    }

    public Long getMonsters() {
        return monsters;
    }

    public void setMonsters(Long monsters) {
        this.monsters = monsters;
    }

    public Long getElites() {
        return elites;
    }

    public void setElites(Long elites) {
        this.elites = elites;
    }

    public Long getHardcoreMonsters() {
        return hardcoreMonsters;
    }

    public void setHardcoreMonsters(Long hardcoreMonsters) {
        this.hardcoreMonsters = hardcoreMonsters;
    }
}
