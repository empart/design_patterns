package com.zzh.factory.abstractFactory;

import com.zzh.factory.abstractFactory.ocean.Crocodile;
import com.zzh.factory.abstractFactory.ocean.Fish;

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
