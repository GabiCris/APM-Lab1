package model;

public class Motorcycle extends Vehicle {
    public Motorcycle(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Motorcycle{ " + super.toString() + "};";
    }
}
