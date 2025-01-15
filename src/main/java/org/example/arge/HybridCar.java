package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + ": Hybrid engine is starting with " + cylinders + " cylinders and a " + batterySize + " kWh battery.");
    }
    @Override
    public void drive() {
        System.out.println(getName() + ": Driving with hybrid power, average " + avgKmPerLiter + " km/l and " + batterySize + " km/charge.");
        super.runEngine();
    }
}
