package com.zzh.abstractFactory;

import com.zzh.abstractFactory.ocean.Crocodile;
import com.zzh.abstractFactory.ocean.Fish;

/**
 * @Author: zhao zhihong
 * @Date: 2022/4/6
 */
public class OceanFactory extends AbstractFactory{
    @Override
    Animals createAnimals() {
        return new Crocodile();
    }

    @Override
    Food createFood() {
        return new Fish();
    }
}
