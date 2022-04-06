package com.zzh.simpleFactory;

/**
 * @Author: zhao zhihong
 * @Date: 2022/1/17
 *
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
