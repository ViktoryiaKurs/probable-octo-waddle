package homework.hw5streamapi;

import java.util.Arrays;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<TemperatureReading> readings = Arrays.asList(
                new TemperatureReading("00:00", 15.5),
                new TemperatureReading("03:00", 14.0),
                new TemperatureReading("06:00", 13.0),
                new TemperatureReading("09:00", 18.5),
                new TemperatureReading("12:00", 22.0),
                new TemperatureReading("15:00", 24.5),
                new TemperatureReading("18:00", 20.0),
                new TemperatureReading("21:00", 17.5)
        );

        double min = readings.stream()
                .map(TemperatureReading::getTemperature)
                .min(Double::compare)
                .get();

        double max = readings.stream()
                .map(TemperatureReading::getTemperature)
                .max(Double::compare)
                .get();

        System.out.println("min = " + min + "\nmax = " + max);
    }
}

class TemperatureReading {
    String time;
    double temperature;

    TemperatureReading(String time, double temperature) {
        this.time = time;
        this.temperature = temperature;
    }

    public double getTemperature() { return temperature; }
    public String getTime() { return time; }
}
