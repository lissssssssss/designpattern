package com.lss.decorator.shaps;

import com.lss.decorator.Shap;

/**
 * @author lishengsheng
 */
public class Rectangle implements Shap {
    @Override
    public void draw() {
        System.out.println("Draw a rectangle");
    }
}
