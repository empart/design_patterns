package com.zzh.abstractFactory;

/**
 * @Author: zhao zhihong
 * @Date: 2022/4/6
 */
public class Main {

    /**
     * 抽象工厂
     *      抽象工厂相当于定义了一些产品的类别，然后根据不同的系列工厂，生产该系列下的所属类别产品和产品行为
     *
     */
    public static void main(String[] args) {

        AbstractFactory landFactory = new LandFactory();
        Animals landAnimals = landFactory.createAnimals();
        landAnimals.eat();
        Food landFood = landFactory.createFood();
        landFood.desc();

        AbstractFactory skyFactory = new SkyFactory();
        Animals skyAnimals = skyFactory.createAnimals();
        skyAnimals.eat();
        Food skyFood = skyFactory.createFood();
        skyFood.desc();

    }

}
