package com.lss.strategy.entity.ducks;

import com.lss.strategy.behavior.fly.impl.FlyNoWay;
import com.lss.strategy.behavior.fly.impl.FlyWithWings;
import com.lss.strategy.behavior.quack.impl.MuteQuack;
import com.lss.strategy.behavior.quack.impl.Quck;
import com.lss.strategy.entity.Duck;

/**
 * @author lishengsheng
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quck();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard duck!");
    }
}
