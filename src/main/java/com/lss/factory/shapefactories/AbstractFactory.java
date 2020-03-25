package com.lss.factory.shapefactories;

import com.lss.factory.shapes.AbstractShape;

/**
 * @author lishengsheng
 */
public abstract class AbstractFactory {
    protected abstract AbstractShape createShap(String color);

    public AbstractShape productShap(String color) {
        AbstractShape shap = createShap(color);
        shap.prepare();
        shap.outline();
        shap.border();
        shap.padding();
        return shap;
    }
}
