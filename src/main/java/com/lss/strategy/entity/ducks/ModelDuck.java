package com.lss.strategy.entity.ducks;

import com.lss.strategy.behavior.fly.FlyBehavior;
import com.lss.strategy.behavior.fly.impl.FlyNoWay;
import com.lss.strategy.behavior.fly.impl.FlyWithWings;
import com.lss.strategy.behavior.quack.QuackBehavior;
import com.lss.strategy.behavior.quack.impl.MuteQuack;
import com.lss.strategy.behavior.quack.impl.Quck;
import com.lss.strategy.entity.Duck;

/**
 * @author lishengsheng
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I am a real Model duck!");
    }
}
