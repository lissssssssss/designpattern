package com.lss.decorator;

import com.lss.decorator.shapdecorator.GreenShapDecorator;
import com.lss.decorator.shapdecorator.RedShapDecorator;
import com.lss.decorator.shaps.Rectangle;
import com.lss.decorator.shaps.Triangle;
import org.junit.Test;

import javax.sound.midi.SoundbankResource;

/**
 * @author lishengsheng
 */
public class DecoratorTest {
    @Test
    public void test() {
        Shap rectangle = new Rectangle();
        System.out.println("*******Draw a rectangle:*******");
        rectangle.draw();

        Shap redShapDecorator = new RedShapDecorator(rectangle);
        System.out.println("********Draw a red rectangle:******");
        redShapDecorator.draw();

        Shap greenShapDecorator = new GreenShapDecorator(rectangle);
        System.out.println("********Draw a green rectangle:*******");
        greenShapDecorator.draw();

        Shap triangle = new Triangle();
        System.out.println("*******Draw a triangle********");
        triangle.draw();

        redShapDecorator = new RedShapDecorator(triangle);
        System.out.println("******Draw a red triangle******");
        redShapDecorator.draw();

        greenShapDecorator = new GreenShapDecorator(triangle);
        System.out.println("Draw a green triangle");
        greenShapDecorator.draw();
    }
}
