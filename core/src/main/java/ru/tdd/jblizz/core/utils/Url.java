package ru.tdd.jblizz.core.utils;

/**
 * Класс для работы с url адресами
 * @author Tribushko Danil
 * @since 19.07.2025
 * <p>
 * Пример использования:
 * <pre>{@code
 * Url.builder("https://eu.api.blizzard.com")
 *    .addPathParam("d3/data")
 *    .addQueryParam("id", 1)
 *    .build()
 * }</pre>
 */
public final class Url {

    public static UrlBuilder builder(String url) {
        return new UrlBuilder(url);
    }

    /**
     * Класс для создания url адреса
     * @author Tribushko Danil
     * @since 19.07.2025
     */
    public static class UrlBuilder {
        // Начальный url адрес, для начала сборки
        private String url;

        private UrlBuilder(String url) {
            this.url = url;
        }

        /**
         * Добавляет query-параметр в url адрес
         * @param key название параметра
         * @param value значение параметра
         * @return текущий билдер
         */
        public UrlBuilder addQueryParam(String key, String value) {
            if (url.contains("?")) {
                url += "&";
            } else {
                url += "?";
            }
            url += key + "=" + value;
            return this;
        }

        /**
         * Добавляет path-параметер в url адрес
         * @param value значение параметра
         * @return текущий билдер
         */
        public UrlBuilder addPathParam(String value) {
            url += "/" + value;
            return this;
        }

        /**
         * Добавляет слеш в адрес
         * @return текущий билдер
         */
        public UrlBuilder addPathPrefix() {
            url += "/";
            return this;
        }

        /**
         * Добавляет числовой path-параметер в url адрес
         * @param value значение параметра
         * @return текущий билдер
         */
        public UrlBuilder addPathParam(Number value) {
            url += "/" + value;
            return this;
        }

        public String build() {
            return url;
        }
    }
}
