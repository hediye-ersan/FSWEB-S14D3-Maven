package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        String message = getClass().getSimpleName() + " Holden engine is starting";
        System.out.println(message);
        return message;
    }

    public String accelerate() {
        String message = getClass().getSimpleName() + " Holden is accelerating";
        System.out.println(message);
        return message;
    }

    public String brake() {
        String message = getClass().getSimpleName() + " Holden is braking";
        System.out.println(message);
        return message;
    }

}
