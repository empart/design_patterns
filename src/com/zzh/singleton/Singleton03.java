package com.zzh.singleton;

/**
 * @author zhao zhihong
 * @date 2022/1/17 5:14 下午
 * <p>
 * 懒汉式单例
 * 解决了加载就实例化的问题
 */
public class Singleton03 {

    private static Singleton03 INSTANCE;

    private Singleton03() {
    }

    /**
     * synchronized解决了并发问题
     * 缺点：锁住整个方法的话，每个线程执行该方法都需要等锁
     *
     * @return
     */
    public static synchronized Singleton03 getInstance() {
        if (INSTANCE == null) {
            //sleep是为了模拟出并发场景
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton03.getInstance().hashCode());
            }).start();
        }
    }

}
