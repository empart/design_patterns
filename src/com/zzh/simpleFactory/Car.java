package com.zzh.simpleFactory;

/**
 * @Author: zhao zhihong
 * @Date: 2022/1/17
 */
public class Car implements Vehicle{

    @Override
    public void go(){
        System.out.println("car drive");
    }

}
