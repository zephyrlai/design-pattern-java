package cn.zephyr.pattern.factory;

import cn.zephyr.patterns.factory.abstr.AbstractFactory;
import cn.zephyr.patterns.factory.abstr.RealFactory;
import cn.zephyr.patterns.factory.func.FuncAutoFactory;
import cn.zephyr.patterns.factory.func.FuncBmwFactory;
import cn.zephyr.patterns.factory.simple.SimpleFactory;
import cn.zephyr.patterns.factory.product.ICar;
import org.junit.Test;

/**
 * @Author: laizonghao
 * @Description:
 * @Date: 2019-06-25 15:28
 */
public class FactoryPatternTest {

    /**
     * 不使用设计模式：需要用户自己了解并实现业务细节
     * 弊端：作为用户，本来就不需要知道或者了解产品的实现细节
     */
    @Test
    public void noFactoryPattern(){
        ICar car = new ICar() {
            @Override
            public String getName() {
                return "自己造";
            }
        };
        System.err.println(car.getName());
    }

    /**
     * 简单工厂模式：用户只需要提出需求，不需要了解和实现业务细节
     * 弊端：用户提出的需求无法实现，则无法产出
     */
    @Test
    public void simpleFactoryTest(){
        ICar bmw = new SimpleFactory().getCar("BMW");
        System.err.println(bmw.getName());
    }

    /**
     * 方法工厂模式：需要什么类型的产品，就new一个对应的工厂然后提取产品
     * 弊端：用户想要获取一个产品，首先需要知道其对应个工厂，问题似乎变得更加复杂了
     */
    @Test
    public void funcFactoryTest(){
        FuncBmwFactory bmwFactory = new FuncBmwFactory();
        ICar bmwCar = bmwFactory.produceICar();
        System.err.println(bmwCar.getName());

        FuncAutoFactory funcAutoFactory = new FuncAutoFactory();
        ICar autoCar = funcAutoFactory.produceICar();
        System.err.println(autoCar.getName());

    }

    /**
     * 抽象工厂模式：直接到工厂的实现类中提取所需的产品，其他的一概不管
     */
    @Test
    public void abstractFactoryTest(){
        AbstractFactory f = new RealFactory();
        System.err.println(f.produceAuto().getName());
        System.err.println(f.produceBmw().getName());
    }
}
