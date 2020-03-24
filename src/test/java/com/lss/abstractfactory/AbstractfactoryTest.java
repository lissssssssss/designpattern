package com.lss.abstractfactory;

import com.lss.abstractfactory.shapefactory.AbstractFactory;
import com.lss.abstractfactory.shapefactory.impl.CircleFactory;
import com.lss.abstractfactory.shapefactory.impl.RectangleFactory;
import com.lss.abstractfactory.shapeproduct.AbstractShape;
import org.junit.Test;

/**
 * @author lishengsheng
 */
public class AbstractfactoryTest {
    @Test
    public void test() {
        AbstractShape shape;
        shape = new CircleFactory().getShap("red");
        shape.show();

        shape = new CircleFactory().getShap("green");
        shape.show();

        shape = new RectangleFactory().getShap("red");
        shape.show();

        shape = new RectangleFactory().getShap("green");
        shape.show();
    }
}
