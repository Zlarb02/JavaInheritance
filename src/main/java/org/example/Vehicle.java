package org.example;

public abstract class Vehicle {
    String brand;
    int kilometers;

    protected Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    private String getBrand() {
        return brand;
    }

    private void setBrand(String brand) {
        this.brand = brand;
    }

    private int getKilometers() {
        return kilometers;
    }

    private void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    public abstract String doStuff();
}
