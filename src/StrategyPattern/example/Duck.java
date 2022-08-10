package StrategyPattern.example;

public abstract class Duck {
    public void quack() {
        System.out.println("꽥");
    }
    public void swim() {
        System.out.println("오리는 수영합니다.");
    }
    public abstract void display();

    // 날 수 있는 오리를 만들기 위해 Duck 클래스에 fly 함수를 추가하면
    // 모든 서브 클래스에서 상속받게 된다.
//    public void fly() {
//        System.out.println("날고 있습니다.");
//    }
}
