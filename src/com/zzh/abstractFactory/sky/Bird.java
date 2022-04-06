package com.zzh.abstractFactory.sky;

import com.zzh.abstractFactory.Animals;

/**
 * @Author: zhao zhihong
 * @Date: 2022/4/6
 */
public class Bird extends Animals {

    @Override
    public void eat(){
        System.out.println("Bird eats insect");
    }

}
