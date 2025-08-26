package org.skypro.skyshop.product;

import org.skypro.skyshop.excrption.BestResultNotFound;
import java.util.*;


public class SearchEngine {
    //private final Searchable[] searchables; // Массив элементов для поиска
    private final List<Searchable> searchableObjects; // Лист - элементов для поиска
    private int size;	                    // Количество элементов

    // Конструктор
    public SearchEngine() {

        //searchableObjects = new LinkedList<>();
        searchableObjects = new ArrayList<>();
        this.size = 0;
    }

    // Поиск по ключевому слову
    public Searchable[] searchByKeyword(String keyword) {
        Searchable[] searchResult = new Searchable[5];
        int count = 0;

        for (Searchable searchable : searchables) {
            if (searchable != null) {
                String searchTerm = searchable.getSearchTerm();
                if (searchTerm.toLowerCase().contains(keyword.toLowerCase())) {
                    if (count < searchResult.length) {
                        searchResult[count++] = searchable;
                        System.out.println(searchable.getStringRepresentation());
                    } else {
                        break;
                    }
                }
            }
        }
        return searchResult;
    }

    // Поиск самого подходящего элемента
    public Searchable findBestMatch(String keyword) throws BestResultNotFound {
        Searchable bestResult = null;
        int found = 0;
        for (Searchable searchable : searchables) {
            if (searchable != null) {
                String str = searchable.getSearchTerm().toLowerCase();
                int score = 0;
                int index = 0;
                while ((index = str.indexOf(keyword.toLowerCase(), index)) != -1) {
                    score++;
                    index++;
                }
                if (score > found) {
                    found = score;
                    bestResult = searchable;
                }
            }
        }
        if (bestResult == null) {
            throw new BestResultNotFound();
        }
        System.out.println(bestResult.getStringRepresentation());
        return bestResult;
    }

    // Добавление в массив
    public void addToSearchable(Searchable searchable) {
        if (size < searchables.length) {
            searchables[size] = searchable;
            size++;
        } else {
            System.out.println("Массив переполнен");
        }
    }

    //  Отображаем все элементы массива
    public void showSearchable() {
        for (Searchable searchable : searchables) {
            if (searchable != null) {
                System.out.println(searchable.getStringRepresentation());
            } else {
                System.out.println("Пусто");
            }
        }
    }
}
