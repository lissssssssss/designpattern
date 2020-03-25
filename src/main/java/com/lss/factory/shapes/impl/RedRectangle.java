package com.lss.factory.shapes.impl;

import com.lss.factory.materialfactories.IMaterialfactory;
import com.lss.factory.shapes.AbstractShape;

/**
 * @author lishengsheng
 */
public class RedRectangle extends AbstractShape {
    private IMaterialfactory materialfactory;

    public RedRectangle(IMaterialfactory materialfactory) {
        this.materialfactory = materialfactory;
    }

    @Override
    public void outline() {
        shapeItself = "Red rectangle";
    }

    @Override
    public void prepare() {
        border = materialfactory.getBorder();
        padding = materialfactory.getPadding();
    }
}
