package ObserverPattern.WeatherStation;

import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemperature = 0.0f;
    private float minTemperature = 99;
    private float temperatureSum = 0.0f;
    private int numReadings = 0;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        float temperature = weatherData.getTemperature();
        temperatureSum += temperature;
        numReadings++;

        if (temperature > this.maxTemperature) {
            this.maxTemperature = temperature;
        }
        if (temperature < this.minTemperature) {
            this.minTemperature = temperature;
        }

        display();
    }

    @Override
    public void display() {
        float avgTemperature = this.temperatureSum / numReadings;
        System.out.println("기온 평균/최대/최저: " + avgTemperature + "/" + this.maxTemperature + "/" + this.minTemperature);
    }
}
