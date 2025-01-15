package org.example.company;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        String message = getClass().getSimpleName() + "Ford engine is starting";
        System.out.println(message);
        return message;
    }

    public String accelerate() {
        String message = getClass().getSimpleName() + "Ford is accelerating";
        System.out.println(message);
        return message;
    }

    public String brake() {
        String message = getClass().getSimpleName() + "Ford is braking";
        System.out.println(message);
        return message;
    }
}
