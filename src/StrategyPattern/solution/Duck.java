package StrategyPattern.solution;

import StrategyPattern.solution.fly.FlyBehavior;
import StrategyPattern.solution.quack.QuackBehavior;

public abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다.");
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }
}
