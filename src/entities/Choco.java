package entities;

public class Choco extends Sweets {

    private String chocoType;

    public Choco(String name, String type, int weight, String chocoType) {
        super(name, type, weight);
        this.chocoType = chocoType;
    }

    public String getChocoType() {
        return chocoType;
    }

    public void setChocoType(String chocoType) {
        this.chocoType = chocoType;
    }

    public String getInfo(){
        return "choco is "+ super.toString();
    }
}
