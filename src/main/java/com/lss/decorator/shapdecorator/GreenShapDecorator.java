package com.lss.decorator.shapdecorator;

import com.lss.decorator.AbstractShapDecorator;
import com.lss.decorator.Shap;

/**
 * @author lishengsheng
 */
public class GreenShapDecorator extends AbstractShapDecorator {
    public GreenShapDecorator(Shap decoratedShap) {
        super(decoratedShap);
    }

    @Override
    public void draw() {
        decoratedShap.draw();
        setBorder();
    }

    private void setBorder() {
        System.out.println("with green Border");
    }
}
