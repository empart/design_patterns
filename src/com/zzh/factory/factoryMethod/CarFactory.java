package com.zzh.factory.factoryMethod;

import com.zzh.factory.simpleFactory.Car;
import com.zzh.factory.simpleFactory.Vehicle;

/**
 * @Author: zhao zhihong
 * @Date: 2022/1/17
 *
 */
public class CarFactory {

    public Vehicle createCar(){
        //一些操作
        return new Car();
    }

}
