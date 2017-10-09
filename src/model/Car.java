package model;

public class Car extends Vehicle {
    public Car(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Car{ " + super.toString() + "};";
    }
}
