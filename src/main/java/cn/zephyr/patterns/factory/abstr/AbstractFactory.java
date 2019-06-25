package cn.zephyr.patterns.factory.abstr;

import cn.zephyr.patterns.factory.product.AutoCar;
import cn.zephyr.patterns.factory.product.BmwCar;

/**
 * @Author: laizonghao
 * @Description: 抽象工厂
 * @Date: 2019-06-25 16:37
 */
public interface AbstractFactory {

    BmwCar produceBmw();

    AutoCar produceAuto();
}
