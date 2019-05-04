package service;

import entities.Sweets;

import java.util.List;

public class Weight implements Iweight {


    @Override
    public int getWeight(List<Sweets> sweets) {
        int weightOfSweets = 0;
        for (Sweets sweet : sweets) {
            weightOfSweets += sweet.getWeight();

        }

        return weightOfSweets;
    }
}
