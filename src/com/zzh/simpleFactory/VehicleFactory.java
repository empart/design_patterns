package com.zzh.simpleFactory;

/**
 * @Author: zhao zhihong
 * @Date: 2022/1/17
 *
 * 简单工厂
 *   可以在生产对象的过程中添加任意操作，控制生产过程
 *
 * 缺点：扩展性不好，每加新类型的对象都要修改工厂
 */
public class VehicleFactory {

    public Car createCar(){
        //业务
        //日志等等
        Car car = new Car();
        //生产后的一些操作
        return car;
    }

    public Train createTrain(){
        return new Train();
    }

    public Plane createPlane(){
        return new Plane();
    }

}
