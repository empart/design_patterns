package com.zzh.strategy;

/**
 * @Author: zhao zhihong
 * @Date: 2022/1/17
 */
public class PlaneStrategy implements TrafficStrategy{
    @Override
    public void go() {
        System.out.println("坐飞机上班");
    }
}
