package cn.zephyr.patterns.singleton;

/**
 * @Author: laizonghao
 * @Description: 懒汉式
 * @Date: 2019-06-25 17:29
 */
public class LazySingletonSynchronized {

    private static LazySingletonSynchronized instance;

    private LazySingletonSynchronized() {

    }

    public static synchronized LazySingletonSynchronized getInstance(){
        if(null == instance){
            instance = new LazySingletonSynchronized();
        }
        return instance;
    }
}
