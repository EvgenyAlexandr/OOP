package org.skypro.skyshop.product;

import org.skypro.skyshop.excrption.BestResultNotFound;
import java.util.*;

public class SearchEngine {
    private final Map<String, Searchable> searchableObjects; // Map элементов для поиска
    private final int capacity;                              // Максимальная вместимость

    // Конструктор
    public SearchEngine(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Размер списка должен быть положительным числом");
        }
        this.capacity = capacity;
        this.searchableObjects = new HashMap<>();
    }

    // Поиск по ключевому слову
    public List<Searchable> searchByKeyword(String keyword) {
        List<Searchable> searchResult = new ArrayList<>();
        String lowerKeyword = keyword.toLowerCase();

        for (Searchable searchable : searchableObjects.values()) {
            if (searchable != null) {
                String searchTerm = searchable.getSearchTerm();
                if (searchTerm.toLowerCase().contains(lowerKeyword)) {
                    searchResult.add(searchable);
                    System.out.println(searchable.getStringRepresentation());
                }
            }
        }
        return searchResult;
    }

    // Поиск самого подходящего элемента
    public Searchable findBestMatch(String keyword) throws BestResultNotFound {
        Searchable bestResult = null;
        int maxScore = 0;
        String lowerKeyword = keyword.toLowerCase();

        for (Searchable searchable : searchableObjects.values()) {
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

    // Добавление в список
    public void addToSearchable(Searchable searchable) {
        if (searchableObjects.size() < capacity) {
            searchableObjects.put(searchable.getSearchTerm(), searchable);
        } else {
            System.out.println("Список переполнен. Максимальная вместимость: " + capacity);
        }
    }

    // Отображаем все элементы списка
    public void showSearchable() {
        if (searchableObjects.isEmpty()) {
            System.out.println("Список пуст");
            return;
        }

        int i = 1;
        for (Searchable searchable : searchableObjects.values()) {
            System.out.println((i++) + ". " + searchable.getStringRepresentation());
        }
    }

    // Метод поиска, возвращающий отсортированную по именам мапу
    public Map<String, Searchable> getSortedSearchableObjects() {
        // Создаем TreeMap для автоматической сортировки по ключам (именам)
        Map<String, Searchable> sortedMap = new TreeMap<>(searchableObjects);
        return sortedMap;
    }

    // Альтернативный метод поиска с возвратом отсортированной мапы (по требованию)
    public Map<String, Searchable> searchAndGetSorted(String keyword) {
        Map<String, Searchable> resultMap = new TreeMap<>(); // TreeMap для автоматической сортировки
        String lowerKeyword = keyword.toLowerCase();

        for (Map.Entry<String, Searchable> entry : searchableObjects.entrySet()) {
            Searchable searchable = entry.getValue();
            if (searchable != null) {
                String searchTerm = searchable.getSearchTerm();
                if (searchTerm.toLowerCase().contains(lowerKeyword)) {
                    resultMap.put(entry.getKey(), searchable);
                }
            }
        }

        return resultMap;
    }


}
