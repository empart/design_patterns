package com.zzh.simpleFactory;

/**
 * @Author: zhao zhihong
 * @Date: 2022/1/17
 */
public class Train implements Vehicle{

    @Override
    public void go(){
        System.out.println("train drive");
    }

}
