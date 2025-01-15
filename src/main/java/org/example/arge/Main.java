package org.example.arge;

public class Main {
    public static void main(String[] args) {
        HybridCar hybridCar = new HybridCar("Toyota Prius", "A hybrid car", 20.5, 8, 4);

        // Call the getter
        System.out.println("Average km per litre: " + hybridCar.getAvgKmPerLiter());
        System.out.println("Number of cylinders: " + hybridCar.getCylinders());
        System.out.println("Battery size: " + hybridCar.getBatterySize());

        ElectricCar electricCar = new ElectricCar("Ford Focus", "A electronic Car", 20.4, 10);

        System.out.println("Average km per Charge: " + electricCar.getAvgKmPerCharge());
        System.out.println("Battery size: " + electricCar.getBatterySize());


        GasPoweredCar gasPoweredCar = new GasPoweredCar("Mercedes Benz", "A gas powered Car", 16.5, 5);
        System.out.println("Average km per litre: " + gasPoweredCar.getAverageKmPerLiter());
        System.out.println("Number of cylinders: " + gasPoweredCar.getCylinders());

    }
}