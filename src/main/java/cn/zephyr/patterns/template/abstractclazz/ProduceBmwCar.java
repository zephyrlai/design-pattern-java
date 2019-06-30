package cn.zephyr.patterns.template.abstractclazz;

/**
 * @Author: laizonghao
 * @Description:
 * @Date: 2019-06-30 20:55
 */
public class ProduceBmwCar extends ProductCar {
    @Override
    public void produceWheels() {
        System.err.println("生产宝马车轮");
    }

    @Override
    public void produceEnginee() {
        System.err.println("生产宝马引擎");
    }

    @Override
    public void produceMetal() {
        System.err.println("生产宝马钢板");
    }

    @Override
    public void assemble() {
        System.err.println("组装宝马汽车");
    }
}
