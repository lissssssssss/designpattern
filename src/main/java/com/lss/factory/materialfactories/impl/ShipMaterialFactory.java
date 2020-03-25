package com.lss.factory.materialfactories.impl;

import com.lss.factory.material.IBorder;
import com.lss.factory.material.IPadding;
import com.lss.factory.material.borders.ShipBorder;
import com.lss.factory.material.paddings.ShipPadding;
import com.lss.factory.materialfactories.IMaterialfactory;

/**
 * @author lishengsheng
 */
public class ShipMaterialFactory implements IMaterialfactory {
    @Override
    public IBorder getBorder() {
        return new ShipBorder();
    }

    @Override
    public IPadding getPadding() {
        return new ShipPadding();
    }
}
