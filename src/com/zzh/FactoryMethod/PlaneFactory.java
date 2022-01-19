package com.zzh.FactoryMethod;

import com.zzh.simpleFactory.Plane;
import com.zzh.simpleFactory.Vehicle;

/**
 * @Author: zhao zhihong
 * @Date: 2022/1/17
 */
public class PlaneFactory {

    public Vehicle createPlane(){
        return new Plane();
    }

}
