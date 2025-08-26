package org.skypro.skyshop.excrption;

public class BestResultNotFound extends Exception{
    public BestResultNotFound(String str ) {
        super ("Не найдено подходящих результатов для: " + str);
    }
}




