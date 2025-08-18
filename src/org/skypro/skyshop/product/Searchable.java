package org.skypro.skyshop.product;

public interface Searchable {
    // метод, который будет возвращать текст, по которому мы будем искать.
    String getSearchTerm();
    // Тип контента
    String getContentType();
    // Метод получения имени Searchable объекта.
    default String getStringRepresentation(){
        return getSearchTerm()+", тип - "+getContentType();
    }

}
