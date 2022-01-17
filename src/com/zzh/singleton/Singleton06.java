package com.zzh.singleton;


/**
 * @author zhao zhihong
 * @date 2022/1/17 5:04 下午
 * <p>
 * 懒汉式单例：静态内部类的方式，既实现了懒汉式(JVM加载外部类的时候，不会去加载内部类)，又能通过JVM保证单例
 */
public class Singleton06 {

    /**
     * 要私有化构造方法，防止别人通过构造方法new
     */
    private Singleton06() {
    }

    private static class Singleton06Holder {
        private static Singleton06 INSTANCE = new Singleton06();
    }

    public static Singleton06 getInstance() {
        return Singleton06Holder.INSTANCE;
    }

}
