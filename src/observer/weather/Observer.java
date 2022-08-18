package observer.weather;

public interface Observer {
    // 모든 옵저버에서 update 메소드를 구현해 측정한 값들을 옵저버에게 전달
    void update();
}
