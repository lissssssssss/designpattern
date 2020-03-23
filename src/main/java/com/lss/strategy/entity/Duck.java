package com.lss.strategy.entity;

import com.lss.strategy.behavior.fly.FlyBehavior;
import com.lss.strategy.behavior.quack.QuackBehavior;

/**
 * @author lishengsheng
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    protected Duck() {
    }
    public abstract void display();
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
}
