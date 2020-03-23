package com.lss.decorator;

/**
 * @author lishengsheng
 */
public abstract class AbstractShapDecorator implements Shap {
    protected Shap decoratedShap;

    public AbstractShapDecorator(Shap decoratedShap) {
        this.decoratedShap = decoratedShap;
    }
}
