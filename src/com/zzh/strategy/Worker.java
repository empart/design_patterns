package com.zzh.strategy;

/**
 * @Author: zhao zhihong
 * @Date: 2022/1/17
 */
public class Worker {

    public void goToWork(TrafficStrategy trafficStrategy){
        trafficStrategy.go();
    }

}
