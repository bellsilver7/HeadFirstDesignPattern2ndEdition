package observer.weather;

public interface Subject {
    void registerObserver(Observer o); // Observer 를 인자로 받아 각각 옵저버를 등록

    void removeObserver(Observer o); // Observer 를 인자로 받아 각각 옵저버를 제거

    void notifyObservers(); // 주제의 상태가 변경되었을 때 모든 옵저버에게 변경 내용을 알리기 위해 호출되는 메소드
}
