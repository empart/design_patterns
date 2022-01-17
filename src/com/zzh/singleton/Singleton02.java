package com.zzh.singleton;

/**
 * @author zhao zhihong
 * @date 2022/1/17 5:14 下午
 * <p>
 * 懒汉式单例
 * 解决了加载就实例化的问题
 * 缺点：多线程并发时，会生成不同的实例
 */
public class Singleton02 {

    private static Singleton02 INSTANCE;

    private Singleton02() {
    }

    public static Singleton02 getInstance() {
        //多线程时，同时多个线程判断到了INSTANCE == null，所以都会去new
        if (INSTANCE == null) {
            //sleep是为了模拟出并发场景
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton02();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton02.getInstance().hashCode());
            }).start();
        }
    }

}
