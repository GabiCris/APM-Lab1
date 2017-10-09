package model;

public class Truck extends Vehicle {
    public Truck(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Truck{ " + super.toString() + "};";
    }
}
