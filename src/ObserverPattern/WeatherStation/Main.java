package ObserverPattern.WeatherStation;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(31, 90, 30.4f);
        weatherData.setMeasurements(27, 95, 29.2f);
        weatherData.setMeasurements(28, 85, 29.2f);
    }
}
