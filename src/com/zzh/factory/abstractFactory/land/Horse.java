package com.zzh.factory.abstractFactory.land;

import com.zzh.factory.abstractFactory.Animals;

/**
 * @Author: zhao zhihong
 * @Date: 2022/4/6
 */
public class Horse extends Animals {

    @Override
    public void eat(){
        System.out.println("horse eats grass");
    }

}
