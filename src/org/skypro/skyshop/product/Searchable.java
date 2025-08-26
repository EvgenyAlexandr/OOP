package org.skypro.skyshop.product;

public interface Searchable {
    // Метод, получение имени объекта
    String getNameProduct();
    // метод, возвращающий, искомый текст.
    String getSearchTerm();
    // Тип контента
    String getContentType();
    // Метод получения имени Searchable объекта.
    default String getStringRepresentation(){
        return getNameProduct() + ", тип - " + getContentType();
    }
}
