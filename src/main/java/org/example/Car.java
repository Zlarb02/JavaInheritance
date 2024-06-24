package org.example;

public class Car extends Vehicle {
    protected Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return "je suis " + brand + " et je fais vroom vroom";
    }
}
