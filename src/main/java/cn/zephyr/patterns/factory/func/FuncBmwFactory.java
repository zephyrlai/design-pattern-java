package cn.zephyr.patterns.factory.func;

import cn.zephyr.patterns.factory.product.BmwCar;
import cn.zephyr.patterns.factory.product.ICar;

/**
 * @Author: laizonghao
 * @Description: 专门生产BMW的工厂
 * @Date: 2019-06-25 16:29
 */
public class FuncBmwFactory implements IFuncFactory {

    @Override
    public ICar produceICar() {
        return new BmwCar();
    }
}
