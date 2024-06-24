package org.example;

public class Hangar {
    public static void main(String[] args) {
        Car f1 = new Car("monoplace", 200);
        Boat titanic = new Boat ("Titanic", 9999);
        System.out.println(
                f1.doStuff()
        );
        System.out.println(
                titanic.doStuff()
        );
    }
}