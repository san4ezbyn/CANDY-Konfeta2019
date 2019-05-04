package entities;

import java.util.List;

public class Podarok {
    private List<Podarok>sweets;

    public Podarok(List<Podarok> sweets) {
        this.sweets = sweets;
    }

    public List<Podarok> getSweets() {
        return sweets;
    }

    public void setSweets(List<Podarok> sweets) {
        this.sweets = sweets;
    }
}
