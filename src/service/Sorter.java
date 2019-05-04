package service;

import entities.Sweets;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorter implements Sortable {
    @Override
    public List<Sweets> findByName(List<Sweets> sweets, String name) {
        return sweets.stream().filter(sweet->sweet.getName().contains(name)).collect(Collectors.toList());
    }

    @Override
    public List<Sweets> sortByWeight(List<Sweets> sortedSweets) {
        Collections.sort(sortedSweets);
        return sortedSweets;
    }
}
