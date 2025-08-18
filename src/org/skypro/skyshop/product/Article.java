package org.skypro.skyshop.product;

public class Article {
    private final String articleName; 		// Название Статьи
    private final String articleText;		// Текст статьи

    public Article(String articleName, String articleText) {
        this.articleName = articleName;
        this.articleText = articleText;
    }

    public String toString() {
        return "Название статьи: " + articleName + '\'' +
               "Текст статьи: " + articleText + '\'';
    }
}
