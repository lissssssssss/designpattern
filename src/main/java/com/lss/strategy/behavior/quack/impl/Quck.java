package com.lss.strategy.behavior.quack.impl;

import com.lss.strategy.behavior.quack.QuackBehavior;

/**
 * @author lishengsheng
 */
public class Quck implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
