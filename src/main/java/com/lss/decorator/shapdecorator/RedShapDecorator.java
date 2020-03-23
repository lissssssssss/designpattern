package com.lss.decorator.shapdecorator;

import com.lss.decorator.AbstractShapDecorator;
import com.lss.decorator.Shap;

/**
 * @author lishengsheng
 */
public class RedShapDecorator extends AbstractShapDecorator {
    public RedShapDecorator(Shap decoratedShap) {
        super(decoratedShap);
    }

    @Override
    public void draw() {
        decoratedShap.draw();
        setBorder();
    }

    private void setBorder() {
        System.out.println("with red Border");
    }
}
