package StrategyPattern.solution;

import StrategyPattern.solution.fly.FlyWithWings;
import StrategyPattern.solution.quack.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("붉은머리 오리");
    }
}
