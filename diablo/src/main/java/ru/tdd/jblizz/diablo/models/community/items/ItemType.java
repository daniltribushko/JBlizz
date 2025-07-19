package ru.tdd.jblizz.diablo.models.community.items;

/**
 * Тип игрового предмета
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class ItemType {
    private boolean twoHanded;
    private String id;

    public ItemType(boolean twoHanded, String id) {
        this.twoHanded = twoHanded;
        this.id = id;
    }

    public boolean isTwoHanded() {
        return twoHanded;
    }

    public void setTwoHanded(boolean twoHanded) {
        this.twoHanded = twoHanded;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
