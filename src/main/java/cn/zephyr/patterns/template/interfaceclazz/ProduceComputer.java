package cn.zephyr.patterns.template.interfaceclazz;

/**
 * @Author: laizonghao
 * @Description: 定义制造电脑的接口类
 * @Date: 2019-06-30 21:05
 */
public interface ProduceComputer {

    void buyCPU();

    void buyMainboard();

    void assemble();

    void installOS();

    default void produceComputer(){
        System.err.println("===制造电脑开始===");
        try {
            buyCPU();
            Thread.sleep(100L);
            buyMainboard();
            Thread.sleep(100L);
            assemble();
            Thread.sleep(100L);
            installOS();
            Thread.sleep(100L);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.err.println("===制造电脑结束===");
    }
}
