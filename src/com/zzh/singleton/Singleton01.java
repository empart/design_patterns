package com.zzh.singleton;

/**
 * @author zhao zhihong
 * @date 2022/1/17 5:04 下午
 * <p>
 * 饿汉式单例
 *      JVM保证一个class文件只会被加载到内存中一次，所以即使并发也只有一个实例
 * 缺点：无论该类会不会被使用，类加载的时候均会被实例化。
 */
public class Singleton01 {
    /**
     * 第一种初始化方式
     */
    private static final Singleton01 INSTANCE = new Singleton01();

    /**
     * 第二种初始化方式
     */
//    private static final Singleton01 INSTANCE;
//
//    static {
//        INSTANCE = new Singleton01();
//    }

    /**
     * 要私有化构造方法，防止别人通过构造方法new
     */
    private Singleton01() {
    }

    public static Singleton01 getInstance() {
        return INSTANCE;
    }


}
