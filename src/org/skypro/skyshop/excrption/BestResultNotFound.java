package org.skypro.skyshop.excrption;

public class BestResultNotFound extends Exception{
    public BestResultNotFound() {
        super ("Ничего подходящего не нашлось");
    }
}