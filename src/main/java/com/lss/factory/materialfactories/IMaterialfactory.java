package com.lss.factory.materialfactories;

import com.lss.factory.material.IBorder;
import com.lss.factory.material.IPadding;

/**
 * @author lishengsheng
 */
public interface IMaterialfactory {
    IBorder getBorder();
    IPadding getPadding();
}
