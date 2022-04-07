package com.zzh.factory.simpleFactory;

/**
 * @Author: zhao zhihong
 * @Date: 2022/1/17
 *
 * 简单工厂
 *  可以在生产对象的过程中添加任意操作，控制生产过程
 *
 *  缺点：扩展性不好，每加新类型的对象都要修改工厂
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
