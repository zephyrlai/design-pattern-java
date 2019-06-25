package cn.zephyr.patterns.factory.simple;

import cn.zephyr.patterns.factory.product.AutoCar;
import cn.zephyr.patterns.factory.product.BmwCar;
import cn.zephyr.patterns.factory.product.ICar;

/**
 * @Author: laizonghao
 * @Description:
 * @Date: 2019-06-25 15:29
 */
public class SimpleFactory {

    public ICar getCar(String name){
        if(name.equals("BMW"))
            return new BmwCar();
        else if(name.equals("AUTO"))
            return new AutoCar();
        return null;
    }
}
