package com.lss.strategy;

import com.lss.strategy.entity.Duck;
import com.lss.strategy.entity.ducks.MallardDuck;
import com.lss.strategy.entity.ducks.ModelDuck;
import org.junit.Test;

/**
 * @author lishengsheng
 */
public class StrategyPatternTest {
    @Test
    public void test() {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        System.out.println("-----------");
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
