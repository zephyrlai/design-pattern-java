package cn.zephyr.patterns.factory.func;

import cn.zephyr.patterns.factory.product.AutoCar;
import cn.zephyr.patterns.factory.product.ICar;

/**
 * @Author: laizonghao
 * @Description: 专门生产Auto的工厂
 * @Date: 2019-06-25 16:30
 */
public class FuncAutoFactory implements IFuncFactory {
    @Override
    public ICar produceICar() {
        return new AutoCar();
    }
}
