package cn.zephyr.patterns.template.abstractclazz;

/**
 * @Author: laizonghao
 * @Description:
 * @Date: 2019-06-30 21:01
 */
public class ProductAutoCar extends ProductCar{
    @Override
    public void produceWheels() {
        System.err.println("生产奥迪车轮");
    }

    @Override
    public void produceEnginee() {
        System.err.println("生产奥迪引擎");
    }

    @Override
    public void produceMetal() {
        System.err.println("生产奥迪钢板");
    }

    @Override
    public void assemble() {
        System.err.println("组装奥迪汽车");
    }
}
