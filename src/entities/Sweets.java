package entities;

public class Sweets implements Comparable<Sweets>{

    private String name;
    private int weight;
    private String type;

    public Sweets(String name, String type, int weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return " THIS "+name + " " +type + " by type " + "and weights " + weight;
    }

    @Override
    public int compareTo(Sweets o) {
        return this.getWeight()-o.getWeight();
    }
}
