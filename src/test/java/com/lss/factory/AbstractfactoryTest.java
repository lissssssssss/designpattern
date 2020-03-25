package com.lss.factory;

import com.lss.factory.shapefactories.impl.CircleFactory;
import com.lss.factory.shapefactories.impl.RectangleFactory;
import com.lss.factory.shapes.AbstractShape;
import org.junit.Test;

/**
 * @author lishengsheng
 */
public class AbstractfactoryTest {
    @Test
    public void test() {
        AbstractShape shape;
        shape = new CircleFactory().productShap("red");
        shape.draw();

        shape = new CircleFactory().productShap("green");
        shape.draw();

        shape = new RectangleFactory().productShap("red");
        shape.draw();

        shape = new RectangleFactory().productShap("green");
        shape.draw();
    }
}
