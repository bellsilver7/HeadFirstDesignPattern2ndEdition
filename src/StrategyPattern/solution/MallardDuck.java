package StrategyPattern.solution;

import StrategyPattern.solution.fly.FlyWithWings;
import StrategyPattern.solution.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("청둥오리");
    }
}
