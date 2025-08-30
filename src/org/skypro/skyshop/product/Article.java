package org.skypro.skyshop.product;

import java.util.Objects;

public class Article implements Searchable {
    private final String articleName; 		// Название Статьи
    private final String articleText;		// Текст статьи

    // Конструктор
    public Article(String articleName, String articleText) {
        this.articleName = articleName;
        this.articleText = articleText;
    }

    // Представление объекта
    public String toString() {
        return "Название статьи: " + articleName + '\'' +
               "Текст статьи: " + articleText + '\'';
    }

    @Override
    public String getNameProduct() {
        return articleName;
    }

    @Override
    public String getSearchTerm() {
        return articleName + ": " + articleText;
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(articleName, article.articleName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(articleName);
    }
}
