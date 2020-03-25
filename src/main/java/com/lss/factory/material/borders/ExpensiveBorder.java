package com.lss.factory.material.borders;

import com.lss.factory.material.IBorder;

/**
 * @author lishengsheng
 */
public class ExpensiveBorder implements IBorder {
    @Override
    public String getBorderType() {
        return "expensive border";
    }
}
