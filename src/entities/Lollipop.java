package entities;

public class Lollipop extends Sweets {

    private String stick;

    public Lollipop(String name, String type, int weight, String stick) {
        super(name, type, weight);
        this.stick = stick;
    }

    public String getStick() {
        return stick;
    }

    public void setStick(String stick) {
        this.stick = stick;
    }


    public String getInfo() {
        return " lolly is " + super.toString();
    }
}
