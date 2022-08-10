package StrategyPattern.solution;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck redhead = new RedheadDuck();
        redhead.performQuack();
        redhead.performFly();
    }
}
