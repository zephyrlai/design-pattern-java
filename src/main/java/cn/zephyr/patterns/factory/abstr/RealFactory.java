package cn.zephyr.patterns.factory.abstr;

import cn.zephyr.patterns.factory.product.AutoCar;
import cn.zephyr.patterns.factory.product.BmwCar;

/**
 * @Author: laizonghao
 * @Description:
 * @Date: 2019-06-25 16:39
 */
public class RealFactory implements AbstractFactory {
    @Override
    public BmwCar produceBmw() {
        return new BmwCar();
    }

    @Override
    public AutoCar produceAuto() {
        return new AutoCar();
    }
}
