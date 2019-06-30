package cn.zephyr.pattern.singleton;

import cn.zephyr.patterns.singleton.LazySingletonInnerClassReflectProof;
import cn.zephyr.patterns.singleton.LazySingletonNotSafe;
import cn.zephyr.patterns.singleton.LazySingletonSynchronized;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

/**
 * @Author: laizonghao
 * @Description:
 * @Date: 2019-06-25 17:31
 */
public class SingletonTest {

    /**
     * 最简单的懒汉式单例：线程不安全
     * 新建100个线程同时启动，去获取一个实例，可能会出现获取到多个不同实例的情况
     * 唯一优势：速度极快
     */
    @Test
    public void threadNotSafe4LazySingleton(){
        long startTime = System.currentTimeMillis();
        Integer count = 2000;
        final CountDownLatch latch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            new Thread(){
                @Override
                public void run() {
                    try {
                        latch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    LazySingletonNotSafe instance = LazySingletonNotSafe.getInstance();
//                    System.err.println(System.currentTimeMillis()+"==="+instance);
                }
            }.start();
            latch.countDown();
        }
        System.err.println("总计用时："+(System.currentTimeMillis()-startTime));
    }

    @Test
    public void lazySingletonCompare(){
        Integer count = 200000000;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            LazySingletonSynchronized instance = LazySingletonSynchronized.getInstance();
        }
        System.err.println("线程安全的单例获取总计用时（低性能）："+(System.currentTimeMillis()-startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            LazySingletonNotSafe instance = LazySingletonNotSafe.getInstance();
        }
        System.err.println("线程不安全的单例获取总计用时（高性能）："+(System.currentTimeMillis()-startTime));
    }


    @Test
    public void lazySingletonUnderReflectAttack(){
        try {
            Class<LazySingletonInnerClassReflectProof> clazz = LazySingletonInnerClassReflectProof.class;
            Constructor<LazySingletonInnerClassReflectProof> constructor = clazz.getDeclaredConstructor();
            constructor.newInstance();
            System.err.println("暴力反射成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("暴力反射失败");
        }
        try {
            LazySingletonInnerClassReflectProof.getInstance();
            LazySingletonInnerClassReflectProof.getInstance();
            LazySingletonInnerClassReflectProof.getInstance();
            System.err.println("正常获取成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("正常获取失败");
        }


    }
}
