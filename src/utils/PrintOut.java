package utils;

import entities.Sweets;

import java.util.List;

public class PrintOut {

    public static void printOut(List<Sweets>sweets){
        for (Sweets sweet : sweets){
            System.out.println(sweet);
        }
    }
}
