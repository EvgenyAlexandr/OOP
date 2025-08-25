package org.skypro.skyshop.product;

public interface Searchable {
    // Метод, получение имени объекта
    String getNameProduct();
    // метод, возврашаюший, искомый текст.
    String getSearchTerm();
    // Тип контента
    String getContentType();
    // Метод получения имени Searchable объекта.
    default String getStringRepresentation(){
        return getNameProduct() + ", тип - " + getContentType();

       // "имя Searchable объекта  — тип Searchable объекта "
    }

}
