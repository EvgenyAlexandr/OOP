package org.skypro.skyshop.product;

import org.skypro.skyshop.excrption.BestResultNotFound;
import java.util.*;
import java.util.stream.Collectors;

public class SearchEngine {

    private final Set<Searchable> searchableObjects; // Set элементов для поиска
    private final int capacity;                      // Максимальная вместимость


    // Конструктор
    public SearchEngine(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Размер списка должен быть положительным числом");
        }
        this.capacity = capacity;
        this.searchableObjects = new HashSet<>();
    }

    // Поиск по ключевому слову
    public Set<Searchable> searchByKeyword(String keyword) {
        return searchableObjects.stream()
                .filter(searchable -> searchable != null &&
                        searchable.getSearchTerm().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toCollection(() -> new TreeSet<>(new SearchableComparator())));
    }




    // Поиск самого подходящего элемента
    public Searchable findBestMatch(String keyword) throws BestResultNotFound {
        Searchable bestResult = null;
        int maxScore = 0;
        String lowerKeyword = keyword.toLowerCase();

        for (Searchable searchable : searchableObjects) {
            if (searchable != null) {
                String str = searchable.getSearchTerm().toLowerCase();
                int score = 0;
                int index = 0;

                // Считаем количество вхождений ключевого слова
                while ((index = str.indexOf(lowerKeyword, index)) != -1) {
                    score++;
                    index += lowerKeyword.length(); // Перескакиваем на длину ключевого слова
                }

                if (score > maxScore) {
                    maxScore = score;
                    bestResult = searchable;
                }
            }
        }

        if (bestResult == null) {
            // Не найдено подходящих результатов
            throw new BestResultNotFound(keyword);
        }

        System.out.println(bestResult.getStringRepresentation());
        return bestResult;
    }

    // Добавление в коллекцию
    public void addToSearchable(Searchable searchable) {
        if (searchableObjects.size() < capacity) {
            searchableObjects.add(searchable);
        } else {
            System.out.println("Коллекция переполнена. Максимальная вместимость: " + capacity);
        }
    }

    // Отображаем все элементы коллекции
    public void showSearchable() {
        if (searchableObjects.isEmpty()) {
            System.out.println("Коллекция пуста");
            return;
        }

        int i = 1;
        for (Searchable searchable : searchableObjects) {
            System.out.println((i++) + ". " + searchable.getStringRepresentation());
        }
    }
}
