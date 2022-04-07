package com.zzh.factory.abstractFactory.ocean;

import com.zzh.factory.abstractFactory.Food;

/**
 * @Author: zhao zhihong
 * @Date: 2022/4/6
 */
public class Fish extends Food {

    @Override
    public void desc(){
        System.out.println("I'm fish");
    }

}
