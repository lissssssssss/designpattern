package com.lss.factory.shapes.impl;

import com.lss.factory.materialfactories.IMaterialfactory;
import com.lss.factory.shapes.AbstractShape;

/**
 * @author lishengsheng
 */
public class GreenCircle extends AbstractShape {
    public GreenCircle(IMaterialfactory materialfactory) {
        this.materialfactory = materialfactory;
    }

    private IMaterialfactory materialfactory;
    @Override
    public void outline() {
        shapeItself = "Green circle";
    }

    @Override
    public void prepare() {
        border = materialfactory.getBorder();
        padding = materialfactory.getPadding();
    }
}
