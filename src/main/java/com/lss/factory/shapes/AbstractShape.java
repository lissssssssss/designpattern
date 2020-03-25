package com.lss.factory.shapes;

import com.lss.factory.material.IBorder;
import com.lss.factory.material.IPadding;

/**
 * @author lishengsheng
 */
public abstract class AbstractShape {
    protected String shapeItself;
    protected IBorder border;
    protected IPadding padding;

    public abstract void outline();

    public void border() {
        shapeItself += ",with " + border.getBorderType();
    }

    public void padding() {
        shapeItself += ",with " + padding.getPaddingType();
    }

    public abstract void prepare();

    public void draw() {
        System.out.println(shapeItself);
    }
}