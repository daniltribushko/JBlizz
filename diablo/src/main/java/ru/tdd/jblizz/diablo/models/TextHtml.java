package ru.tdd.jblizz.diablo.models;

/**
 * Содержит данные в виде обычной строки и строки в фомате html
 * @author Tribushko Danil
 * @since 19.07.2025
 */
public final class TextHtml {
    private String textHtml;
    private String text;

    public TextHtml(String textHtml, String text) {
        this.textHtml = textHtml;
        this.text = text;
    }

    public String getTextHtml() {
        return textHtml;
    }

    public void setTextHtml(String textHtml) {
        this.textHtml = textHtml;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
