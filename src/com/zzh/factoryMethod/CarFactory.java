package com.zzh.factoryMethod;

import com.zzh.simpleFactory.Car;
import com.zzh.simpleFactory.Vehicle;

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
