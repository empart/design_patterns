package com.zzh.singleton;


/**
 * @author zhao zhihong
 * @date 2022/1/17 5:04 下午
 *
 *  枚举单例(Effective Java中的写法)，枚举还可以防止被其他人反射出新的实例
 */
public enum Singleton07 {

    INSTANCE;

    public static void main(String[] args){

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton07.INSTANCE.hashCode());
            }).start();
        }
    }
}
