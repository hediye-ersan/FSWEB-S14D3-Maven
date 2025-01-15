package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;
    private double avgKmPerLitre;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public void setAvgKmPerLitre(double avgKmPerLitre) {
        this.avgKmPerLitre = avgKmPerLitre;
    }

    public void startEngine() {
        System.out.println(name + ": Engine is starting.");
    }
    public void drive() {
        System.out.println(name + ": Driving");
        runEngine();
    }
    protected void runEngine() {
        System.out.println(name + ": Engine is running.");
    }
    public String getName() {
        return name;
    }

}
