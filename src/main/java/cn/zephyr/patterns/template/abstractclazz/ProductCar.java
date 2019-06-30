package cn.zephyr.patterns.template.abstractclazz;

/**
 * @Author: laizonghao
 * @Description: 定义造车流程的抽象类
 * @Date: 2019-06-30 20:50
 */
public abstract class ProductCar {
    public abstract void produceWheels();

    public abstract void produceEnginee();

    public abstract void produceMetal();

    public abstract void assemble();

    public final void produceCar(){
        try {
            System.out.println("===制造汽车开始===");
            Thread.sleep(100L);
            produceWheels();
            Thread.sleep(100L);
            produceMetal();
            Thread.sleep(100L);
            produceEnginee();
            Thread.sleep(100L);
            assemble();
            Thread.sleep(100L);
            System.out.println("===制造汽车完成===");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
