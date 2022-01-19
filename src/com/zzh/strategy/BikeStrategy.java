package com.zzh.strategy;

/**
 * @Author: zhao zhihong
 * @Date: 2022/1/17
 */
public class BikeStrategy implements TrafficStrategy{
    @Override
    public void go() {
        System.out.println("骑自行车上班");
    }
}
