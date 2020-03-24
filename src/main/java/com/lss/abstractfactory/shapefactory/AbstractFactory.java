package com.lss.abstractfactory.shapefactory;

import com.lss.abstractfactory.shapeproduct.AbstractShape;

/**
 * @author lishengsheng
 */
public abstract class AbstractFactory {
    public AbstractShape getShap(String color) {
        AbstractShape shap = createShap(color);
        shap.outline();
        shap.fillColor();
        return shap;
    }
    protected abstract AbstractShape createShap(String color);
}
