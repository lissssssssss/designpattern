package com.lss.abstractfactory.shapeproduct;

/**
 * @author lishengsheng
 */
public abstract class AbstractShape {
    protected String outline;
    protected String color;
    public abstract void outline();
    public abstract void fillColor();

    public AbstractShape() {
        outline = "none outline";
        color = "none color";
    }

    public void show() {
        System.out.println("this is a " + color + " " + outline);
    }
}
