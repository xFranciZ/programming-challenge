package de.exxcellent.challenge.model;

public class WeatherData {
    private int day;
    private int minTemperature;
    private int maxTemperature;

    public WeatherData(int day, int minTemperature, int maxTemperature) {
        this.day = day;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public int getDay() {
        return day;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }
}