package com.zzh.factory.abstractFactory;

import com.zzh.factory.abstractFactory.sky.Bird;
import com.zzh.factory.abstractFactory.sky.Insect;

/**
 * @Author: zhao zhihong
 * @Date: 2022/4/6
 */
public class SkyFactory extends AbstractFactory{
    @Override
    Animals createAnimals() {
        return new Bird();
    }

    @Override
    Food createFood() {
        return new Insect();
    }
}
