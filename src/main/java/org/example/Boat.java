package org.example;

public class Boat extends Vehicle {

    protected Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return "je suis " + brand + " et je fais glouglou";
    }
}
