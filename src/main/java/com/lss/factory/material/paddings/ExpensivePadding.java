package com.lss.factory.material.paddings;

import com.lss.factory.material.IPadding;

/**
 * @author lishengsheng
 */
public class ExpensivePadding implements IPadding {
    @Override
    public String getPaddingType() {
        return "expensive  color panding";
    }
}
