package org.skypro.skyshop.product;

import org.skypro.skyshop.excrption.BestResultNotFound;
import java.util.*;


//


public class SearchEngine {
    private final List<Searchable> searchableObjects; // Список элементов для поиска
    private final int capacity;                      // Максимальная вместимость

    // Конструктор
    public SearchEngine(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Размер списка должен быть положительным числом");
        }
        this.capacity = capacity;
        this.searchableObjects = new ArrayList<>(capacity);
    }

    // Поиск по ключевому слову
    public List<Searchable> searchByKeyword(String keyword) {
        List<Searchable> searchResult = new ArrayList<>();
        String lowerKeyword = keyword.toLowerCase();

        for (Searchable searchable : searchableObjects) {
            if (searchable != null) {
                String searchTerm = searchable.getSearchTerm();
                if (searchTerm.toLowerCase().contains(lowerKeyword)) {
                    if (searchResult.size() < 5) { // Ограничиваем 5 результатами
                        searchResult.add(searchable);
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
            throw new BestResultNotFound("Не найдено подходящих результатов для: " + keyword);
        }

        System.out.println(bestResult.getStringRepresentation());
        return bestResult;
    }

    // Добавление в список
    public void addToSearchable(Searchable searchable) {
        if (searchableObjects.size() < capacity) {
            searchableObjects.add(searchable);
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

        for (int i = 0; i < searchableObjects.size(); i++) {
            Searchable searchable = searchableObjects.get(i);
            System.out.println((i + 1) + ". " + searchable.getStringRepresentation());
        }
    }

    // Дополнительные полезные методы
    public int getSize() {
        return searchableObjects.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return searchableObjects.isEmpty();
    }

    public boolean isFull() {
        return searchableObjects.size() >= capacity;
    }

    // Удаление элемента
    public boolean removeSearchable(Searchable searchable) {
        return searchableObjects.remove(searchable);
    }

    // Очистка списка
    public void clearSearchable() {
        searchableObjects.clear();
    }

    // Получение элемента по индексу
    public Searchable getSearchable(int index) {
        if (index < 0 || index >= searchableObjects.size()) {
            throw new IndexOutOfBoundsException("Индекс: " + index + ", Размер: " + searchableObjects.size());
        }
        return searchableObjects.get(index);
    }
}
