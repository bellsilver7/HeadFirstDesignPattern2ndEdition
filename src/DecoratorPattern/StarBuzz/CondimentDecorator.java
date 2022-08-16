package DecoratorPattern.StarBuzz;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage; // 각 데코레이터가 감쌀 음료를 나타내는 Beverage 객체

    public abstract String getDescription(); // 모든 첨가물 데코레이ㅓ에 이 메소드를 새로 구현하도록 만들 계획

    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        return 0;
    }
}
