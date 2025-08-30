package org.skypro.skyshop.product;

import java.util.Comparator;

public class SearchableComparator implements Comparator<Searchable> {
    @Override
    public int compare(Searchable s1, Searchable s2) {
        // 1. Сравниваем длины имен
        int lengthComparison = Integer.compare(s1.getSearchTerm().length(), s2.getSearchTerm().length());

        // 2. Если длины равны, сравниваем имена через compareTo
        if (lengthComparison == 0) {
            return s1.getSearchTerm().compareTo(s2.getSearchTerm());
        }

        // Возвращаем результат сравнения длин, если они не равны
        return lengthComparison;
    }
}