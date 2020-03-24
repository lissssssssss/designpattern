package com.lss.abstractfactory.shapefactory.impl;

import com.lss.abstractfactory.shapefactory.AbstractFactory;
import com.lss.abstractfactory.shapeproduct.AbstractShape;
import com.lss.abstractfactory.shapeproduct.impl.GreenRectangle;
import com.lss.abstractfactory.shapeproduct.impl.RedRectangle;

/**
 * @author lishengsheng
 */
public class RectangleFactory extends AbstractFactory {
    @Override
    protected AbstractShape createShap(String color) {
        AbstractShape shap = null;
        if ("red".equalsIgnoreCase(color)) {
            shap = new RedRectangle();
        } else if ("green".equalsIgnoreCase(color)) {
            shap = new GreenRectangle();
        }
        return shap;
    }
}
