package com.zzh.factory.factoryMethod;

import com.zzh.factory.simpleFactory.Plane;
import com.zzh.factory.simpleFactory.Vehicle;

/**
 * @Author: zhao zhihong
 * @Date: 2022/1/17
 */
public class PlaneFactory {

    public Vehicle createPlane() {
        return new Plane();
    }

}
