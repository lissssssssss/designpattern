package com.lss.abstractfactory.shapefactory.impl;

import com.lss.abstractfactory.shapefactory.AbstractFactory;
import com.lss.abstractfactory.shapeproduct.AbstractShape;
import com.lss.abstractfactory.shapeproduct.impl.GreenCircle;
import com.lss.abstractfactory.shapeproduct.impl.RedCircle;

/**
 * @author lishengsheng
 */
public class CircleFactory extends AbstractFactory {
    @Override
    protected AbstractShape createShap(String color) {
        AbstractShape shap = null;
        if ("red".equalsIgnoreCase(color)) {
            shap = new RedCircle();
        } else if ("green".equalsIgnoreCase(color)) {
            shap = new GreenCircle();
        }
        return shap;
    }
}
