package com.lss.abstractfactory.shapeproduct.impl;

import com.lss.abstractfactory.shapeproduct.AbstractShape;

/**
 * @author lishengsheng
 */
public class GreenCircle extends AbstractShape {
    @Override
    public void outline() {
        outline = "circle";
    }

    @Override
    public void fillColor() {
        color = "green";
    }
}
