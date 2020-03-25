package com.lss.factory.materialfactories.impl;

import com.lss.factory.material.IBorder;
import com.lss.factory.material.IPadding;
import com.lss.factory.material.borders.ExpensiveBorder;
import com.lss.factory.material.paddings.ExpensivePadding;
import com.lss.factory.materialfactories.IMaterialfactory;

/**
 * @author lishengsheng
 */
public class ExpensiveMaterialfactory implements IMaterialfactory {
    @Override
    public IBorder getBorder() {
        return new ExpensiveBorder();
    }

    @Override
    public IPadding getPadding() {
        return new ExpensivePadding();
    }
}
