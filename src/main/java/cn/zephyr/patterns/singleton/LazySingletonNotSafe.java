package cn.zephyr.patterns.singleton;

/**
 * @Author: laizonghao
 * @Description: 懒汉式
 * @Date: 2019-06-25 17:29
 */
public class LazySingletonNotSafe {

    private static LazySingletonNotSafe instance;

    private LazySingletonNotSafe() {

    }

    public static LazySingletonNotSafe getInstance(){
        if(null == instance){
            instance = new LazySingletonNotSafe();
        }
        return instance;
    }
}
