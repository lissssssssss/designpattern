package com.lss.strategy.behavior.fly.impl;

import com.lss.strategy.behavior.fly.FlyBehavior;

/**
 * @author lishengsheng
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cant not fly!");
    }
}
