package cn.zephyr.patterns.singleton;

/**
 * @Author: laizonghao
 * @Description: 内部类方式实现高性能的、节省内存的单例模式
 * @Date: 2019-06-25 20:06
 */
public class LazySingletonInnerClass {
    // 原理：只有外部类被调用时，内部类才会初始化

    /**
     * static: 单例空间共享
     * final: 方法不能重写，不能重载
     * @return
     */
    public static final LazySingletonInnerClass getInstance(){
        return InnerSingletonClass.INSTANCE;
    }

    private static class InnerSingletonClass{
        private static final LazySingletonInnerClass INSTANCE = new LazySingletonInnerClass();
    }
}
