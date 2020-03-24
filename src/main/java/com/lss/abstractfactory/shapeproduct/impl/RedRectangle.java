package com.lss.abstractfactory.shapeproduct.impl;

import com.lss.abstractfactory.shapeproduct.AbstractShape;

/**
 * @author lishengsheng
 */
public class RedRectangle extends AbstractShape {
    @Override
    public void outline() {
        outline = "rectangle";
    }

    @Override
    public void fillColor() {
        color = "red";
    }
}
