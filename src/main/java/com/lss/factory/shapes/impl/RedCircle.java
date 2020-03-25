package com.lss.factory.shapes.impl;

import com.lss.factory.materialfactories.IMaterialfactory;
import com.lss.factory.shapes.AbstractShape;

/**
 * @author lishengsheng
 */
public class RedCircle extends AbstractShape {
    private IMaterialfactory materialfactory;

    public RedCircle(IMaterialfactory materialfactory) {
        this.materialfactory = materialfactory;
    }

    @Override
    public void outline() {
        shapeItself = "Red circle";
    }

    @Override
    public void prepare() {
        border = materialfactory.getBorder();
        padding = materialfactory.getPadding();
    }
}
