package com.zzh.strategy;

/**
 * @Author: zhao zhihong
 * @Date: 2022/1/17
 */
public class Main {

    /**
     * 策略模式
     *  针对某一件事采取不同的策略去做
     *  省略了if else，有新的策略直接实现接口即可
     * @param args
     */
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.goToWork(new BikeStrategy());
        worker.goToWork(new CarStrategy());
        worker.goToWork(new PlaneStrategy());
    }

}
