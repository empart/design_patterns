package com.zzh.factory.simpleFactory;

/**
 * @Author: zhao zhihong
 * @Date: 2022/1/17
 */
public class Plane implements Vehicle{

    @Override
    public void go(){
        System.out.println("plane drive");
    }

}
