package service;

import entities.Sweets;

import java.util.List;

public interface Sortable {

    List<Sweets> findByName (List<Sweets>sweets, String name);

    List<Sweets>sortByWeight (List<Sweets>unsortedSweets);
}
