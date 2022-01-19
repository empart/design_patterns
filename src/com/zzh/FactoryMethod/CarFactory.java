package com.zzh.FactoryMethod;

import com.zzh.simpleFactory.Car;
import com.zzh.simpleFactory.Vehicle;

/**
 * @Author: zhao zhihong
 * @Date: 2022/1/17
 *
 * 工厂方法
 *      每个类都有各自的工厂来生产对象
 * 缺点：还是要每回new不同的工厂来生产对象
 */
public class CarFactory {

    public Vehicle createCar(){
        //一些操作
        return new Car();
    }

}
