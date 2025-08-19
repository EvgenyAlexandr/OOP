package org.skypro.skyshop.product;

public class Article implements Searchable {
    private final String articleName; 		// Название Статьи
    private final String articleText;		// Текст статьи

    public Article(String articleName, String articleText) {
        this.articleName = articleName;
        this.articleText = articleText;
    }

    // Представление объекта
    public String toString() {
        return "Название статьи: " + articleName + '\'' +
               "Текст статьи: " + articleText + '\'';
    }

    public String getName() {
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
}
