package com.lss.factory.shapefactories.impl;

import com.lss.factory.materialfactories.impl.ExpensiveMaterialfactory;
import com.lss.factory.materialfactories.impl.ShipMaterialFactory;
import com.lss.factory.shapefactories.AbstractFactory;
import com.lss.factory.shapes.AbstractShape;
import com.lss.factory.shapes.impl.GreenCircle;
import com.lss.factory.shapes.impl.RedCircle;

/**
 * @author lishengsheng
 */
public class CircleFactory extends AbstractFactory {
    @Override
    protected AbstractShape createShap(String color) {
        AbstractShape shap = null;
        if ("red".equalsIgnoreCase(color)) {
            shap = new RedCircle(new ExpensiveMaterialfactory());
        } else if ("green".equalsIgnoreCase(color)) {
            shap = new GreenCircle(new ShipMaterialFactory());
        }
        return shap;
    }
}
