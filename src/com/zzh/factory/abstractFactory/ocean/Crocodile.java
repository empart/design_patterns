package com.zzh.factory.abstractFactory.ocean;

import com.zzh.factory.abstractFactory.Animals;

/**
 * @Author: zhao zhihong
 * @Date: 2022/4/6
 */
public class Crocodile extends Animals {

    @Override
    public void eat(){
        System.out.println("Crocodile eats fish");
    }

}
