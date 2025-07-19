package ru.tdd.jblizz.diablo.models.community.items;

import java.util.List;

/**
 * Содержит данные предмета
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class Item {
    private String id;
    private String slug;
    private String name;
    private String icon;
    private String tooltipParams;
    private Integer requiredLevel;
    private Integer stackSizeMax;
    private boolean accountBound;
    private String flavorText;
    private String flavorTextHtml;
    private String typeName;
    private ItemType itemType;
    private String armor;
    private String armorHtml;
    private String block;
    private String blockHtml;
    private String damage;
    private String dps;
    private String damageHtml;
    private String color;
    private boolean isSeasonRequiredToDrop;
    private Integer seasonRequiredToDrop;
    private List<String> slots;
    private ItemAttribute attributes;
    private List<RandomAffix> randomAffixes;
    private List<String> setItems;

    public Item(String id, String slug, String name, String icon, String tooltipParams, Integer requiredLevel, Integer stackSizeMax, boolean accountBound, String flavorText, String flavorTextHtml, String typeName, ItemType itemType, String armor, String armorHtml, String block, String blockHtml, String damage, String dps, String damageHtml, String color, boolean isSeasonRequiredToDrop, Integer seasonRequiredToDrop, List<String> slots, ItemAttribute attributes, List<RandomAffix> randomAffixes, List<String> setItems) {
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.icon = icon;
        this.tooltipParams = tooltipParams;
        this.requiredLevel = requiredLevel;
        this.stackSizeMax = stackSizeMax;
        this.accountBound = accountBound;
        this.flavorText = flavorText;
        this.flavorTextHtml = flavorTextHtml;
        this.typeName = typeName;
        this.itemType = itemType;
        this.armor = armor;
        this.armorHtml = armorHtml;
        this.block = block;
        this.blockHtml = blockHtml;
        this.damage = damage;
        this.dps = dps;
        this.damageHtml = damageHtml;
        this.color = color;
        this.isSeasonRequiredToDrop = isSeasonRequiredToDrop;
        this.seasonRequiredToDrop = seasonRequiredToDrop;
        this.slots = slots;
        this.attributes = attributes;
        this.randomAffixes = randomAffixes;
        this.setItems = setItems;
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

    public String getTooltipParams() {
        return tooltipParams;
    }

    public void setTooltipParams(String tooltipParams) {
        this.tooltipParams = tooltipParams;
    }

    public Integer getRequiredLevel() {
        return requiredLevel;
    }

    public void setRequiredLevel(Integer requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

    public Integer getStackSizeMax() {
        return stackSizeMax;
    }

    public void setStackSizeMax(Integer stackSizeMax) {
        this.stackSizeMax = stackSizeMax;
    }

    public boolean isAccountBound() {
        return accountBound;
    }

    public void setAccountBound(boolean accountBound) {
        this.accountBound = accountBound;
    }

    public String getFlavorText() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    public String getFlavorTextHtml() {
        return flavorTextHtml;
    }

    public void setFlavorTextHtml(String flavorTextHtml) {
        this.flavorTextHtml = flavorTextHtml;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public String getArmorHtml() {
        return armorHtml;
    }

    public void setArmorHtml(String armorHtml) {
        this.armorHtml = armorHtml;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getBlockHtml() {
        return blockHtml;
    }

    public void setBlockHtml(String blockHtml) {
        this.blockHtml = blockHtml;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getDps() {
        return dps;
    }

    public void setDps(String dps) {
        this.dps = dps;
    }

    public String getDamageHtml() {
        return damageHtml;
    }

    public void setDamageHtml(String damageHtml) {
        this.damageHtml = damageHtml;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSeasonRequiredToDrop() {
        return isSeasonRequiredToDrop;
    }

    public void setSeasonRequiredToDrop(boolean seasonRequiredToDrop) {
        isSeasonRequiredToDrop = seasonRequiredToDrop;
    }

    public Integer getSeasonRequiredToDrop() {
        return seasonRequiredToDrop;
    }

    public void setSeasonRequiredToDrop(Integer seasonRequiredToDrop) {
        this.seasonRequiredToDrop = seasonRequiredToDrop;
    }

    public List<String> getSlots() {
        return slots;
    }

    public void setSlots(List<String> slots) {
        this.slots = slots;
    }

    public ItemAttribute getAttributes() {
        return attributes;
    }

    public void setAttributes(ItemAttribute attributes) {
        this.attributes = attributes;
    }

    public List<RandomAffix> getRandomAffixes() {
        return randomAffixes;
    }

    public void setRandomAffixes(List<RandomAffix> randomAffixes) {
        this.randomAffixes = randomAffixes;
    }

    public List<String> getSetItems() {
        return setItems;
    }

    public void setSetItems(List<String> setItems) {
        this.setItems = setItems;
    }
}
