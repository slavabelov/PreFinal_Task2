public class Plaything {
    private int ID;
    private String name;
    private int amount;
    private double weight;

    public Toy(int ID, String name, int amount, double weight) {
        this.ID = ID;
        this.name = name;
        this.amount = amount;
        this.weight = weight;
    }

    public int getterId() {
        return ID;
    }

    public String getterName() {
        return name;
    }

    public int getterAmount() {
        return amount;
    }

    public double getterWeight() {
        return weight;
    }

    public void setterAmount(int amount) {
        this.amount = amount;
    }

    public void setterWeight(double weight) {
        this.weight = weight;
    }
}