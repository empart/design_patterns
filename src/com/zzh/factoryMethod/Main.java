package com.zzh.factoryMethod;

import com.zzh.simpleFactory.Vehicle;

/**
 * @Author: zhao zhihong
 * @Date: 2022/4/6
 *
 * 工厂方法
 *     每个类都有各自的工厂来生产对象
 * 缺点：还是要每回new不同的工厂来生产对象
 */
public class Main {

    public static void main(String[] args) {
        Vehicle car = new CarFactory().createCar();
        Vehicle plane = new PlaneFactory().createPlane();
    }

}
