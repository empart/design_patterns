package com.zzh.singleton;

/**
 * @author zhao zhihong
 * @date 2022/1/17 5:14 下午
 * <p>
 * 懒汉式单例
 * 解决了加载就实例化的问题
 */
public class Singleton04 {

    private static Singleton04 INSTANCE;

    private Singleton04() {
    }

    /**
     * synchronized锁住部分代码块
     */
    public static Singleton04 getInstance() {
        if (INSTANCE == null) {
            //多线程时，同时多个线程判断到了INSTANCE == null，同时在此处等锁，第一个线程释放后，后续等待线程拿到锁依然会去重复new
            synchronized (Singleton04.class) {
                //sleep是为了模拟出并发场景
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Singleton04();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton04.getInstance().hashCode());
            }).start();
        }
    }

}
