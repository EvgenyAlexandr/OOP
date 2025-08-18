package org.skypro.skyshop.product;

public interface Searchable {
    // метод, возврашаюший, искомый текст.
    String getSearchTerm();
    // Тип контента
    String getContentType();
    // Метод получения имени Searchable объекта.
    default String getStringRepresentation(){
        return getSearchTerm()+", тип - "+getContentType();
    }

}
