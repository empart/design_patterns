package com.zzh.abstractFactory;

import com.zzh.abstractFactory.land.Grass;
import com.zzh.abstractFactory.land.Horse;

/**
 * @Author: zhao zhihong
 * @Date: 2022/4/6
 */
public class LandFactory extends AbstractFactory{
    @Override
    Animals createAnimals() {
        return new Horse();
    }

    @Override
    Food createFood() {
        return new Grass();
    }
}
