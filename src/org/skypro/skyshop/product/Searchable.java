package org.skypro.skyshop.product;

public interface Searchable {
    // Метод, получение имени объекта
    String getName();
    // метод, возврашаюший, искомый текст.
    String getSearchTerm();
    // Тип контента
    String getContentType();
    // Метод получения имени Searchable объекта.
    default String getStringRepresentation(){
        return getName() + ", тип - " + getContentType();

       // "имя Searchable объекта  — тип Searchable объекта "
    }

}
