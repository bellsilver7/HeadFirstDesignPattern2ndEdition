package ObserverPattern.WeatherStation;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    // 생성자에 weatherData 라는 주제가 전달되며, 그 객체를 사용해 디스플레이를 옵저버로 등록합니다.
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        // 온도와 습도를 저장하고 display()를 호출합니다.
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("현재 상태: 온도 " + temperature + "°C, 습도 " + humidity + "%");
    }
}
