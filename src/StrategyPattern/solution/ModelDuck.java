package StrategyPattern.solution;

import StrategyPattern.solution.fly.FlyNoWay;
import StrategyPattern.solution.quack.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("가짜 모형 오리입니다.");
    }
}
