package ru.job4j.calculator;

public class TemperatureFit {

    public static double idealTemperatureForFruits(int temperature) {
        return (temperature < 0 || temperature > 10) ? 5.0 : temperature;
    }

    public static double idealTemperatureForMeat(int temperature) {
        return (temperature < -2 || temperature > 4) ? 1.0 : temperature;
    }

    public static void main(String[] args) {
        int temperature = 10; // Example room temperature
        double fruitsTemp = TemperatureFit.idealTemperatureForFruits(temperature);
        double meatTemp = TemperatureFit.idealTemperatureForMeat(temperature);
        System.out.println("Ideal temperature for fruits is " + fruitsTemp + "°C");
        System.out.println("Ideal temperature for meat is " + meatTemp + "°C");
    }
}

}
