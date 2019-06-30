package cn.zephyr.pattern.template;

import cn.zephyr.patterns.template.abstractclazz.ProduceBmwCar;
import cn.zephyr.patterns.template.abstractclazz.ProductAutoCar;
import cn.zephyr.patterns.template.abstractclazz.ProductCar;
import cn.zephyr.patterns.template.interfaceclazz.ProduceComputer;
import cn.zephyr.patterns.template.interfaceclazz.ProduceDellComputer;
import cn.zephyr.patterns.template.interfaceclazz.ProduceMacComputer;
import org.junit.Test;

/**
 * @Author: laizonghao
 * @Description:
 * @Date: 2019-06-30 20:57
 */
public class TemplatePatternTest {

    @Test
    public void abstractClazzTest(){
        ProductCar productCar = new ProduceBmwCar();
        productCar.produceCar();
        productCar = new ProductAutoCar();
        productCar.produceCar();
    }

    @Test
    public void interfaceClazzTest(){
        ProduceComputer produceComputer = new ProduceMacComputer();
        produceComputer.produceComputer();
        produceComputer = new ProduceDellComputer();
        produceComputer.produceComputer();
    }
}
