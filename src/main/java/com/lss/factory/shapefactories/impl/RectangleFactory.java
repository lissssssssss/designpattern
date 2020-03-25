package com.lss.factory.shapefactories.impl;

import com.lss.factory.materialfactories.impl.ExpensiveMaterialfactory;
import com.lss.factory.materialfactories.impl.ShipMaterialFactory;
import com.lss.factory.shapefactories.AbstractFactory;
import com.lss.factory.shapes.AbstractShape;
import com.lss.factory.shapes.impl.GreenRectangle;
import com.lss.factory.shapes.impl.RedRectangle;

/**
 * @author lishengsheng
 */
public class RectangleFactory extends AbstractFactory {
    @Override
    protected AbstractShape createShap(String color) {
        AbstractShape shap = null;
        if ("red".equalsIgnoreCase(color)) {
            shap = new RedRectangle(new ShipMaterialFactory());
        } else if ("green".equalsIgnoreCase(color)) {
            shap = new GreenRectangle(new ExpensiveMaterialfactory());
        }
        return shap;
    }
}
