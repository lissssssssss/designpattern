package com.lss.abstractfactory.shapeproduct.impl;

import com.lss.abstractfactory.shapeproduct.AbstractShape;

/**
 * @author lishengsheng
 */
public class RedCircle extends AbstractShape {
    @Override
    public void outline() {
        outline = "circle";
    }

    @Override
    public void fillColor() {
        color = "red";
    }
}
