package com.zzh.singleton;

/**
 * @author zhao zhihong
 * @date 2022/1/17 5:14 下午
 * <p>
 * 懒汉式单例
 * 解决了加载就实例化的问题
 * <p>
 * 此种写法是double-checked locking，需要对INSTANCE加volatile，防止指令重排
 */
public class Singleton05 {

    private static volatile Singleton05 INSTANCE;

    private Singleton05() {
    }

    /**
     * synchronized锁住部分代码块，同时在被锁住的代码块内部再次判断INSTANCE == null
     * double-checked locking
     */
    public static Singleton05 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton05.class) {
                if (INSTANCE == null) {
                    //sleep是为了模拟出并发场景
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Singleton05();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton05.getInstance().hashCode());
            }).start();
        }
    }

}
