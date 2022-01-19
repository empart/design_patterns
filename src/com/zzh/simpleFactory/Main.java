package com.zzh.simpleFactory;

/**
 * @Author: zhao zhihong
 * @Date: 2022/1/17
 */
public class Main {

    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        Vehicle v = factory.createCar();
        v.go();
        Vehicle v1 = factory.createTrain();
        v1.go();
    }

}
