package cn.zephyr.pattern.strategy;

import cn.zephyr.patterns.strategy.enums.PayStatus;
import cn.zephyr.patterns.strategy.enums.PayTypeEnum;
import cn.zephyr.patterns.strategy.order.Order;
import org.junit.Test;

import java.util.UUID;

/**
 * @Author: laizonghao
 * @Description:
 * @Date: 2019-06-30 17:35
 */
public class StrategyTest {

    @Test
    public void paymentTest(){
        // 模拟后端提供给前端的支付方式字典
        String[] payType = {"ALIPAY","WECHATPAY"};
        // 模拟用户行为，选择支付方式
        PayTypeEnum payTypeEnum = PayTypeEnum.valueOf(payType[(int) (Math.random() * 2)]);
        System.err.println("选定支付方式："+payTypeEnum);
        System.err.println("提交订单，开始结算：");
        Order order = new Order(UUID.randomUUID().toString().replace("-",""),200D,payTypeEnum);
        // 模拟后端的结算业务
        PayStatus payStatus = order.getPaid();
        System.err.println(payStatus);
    }
}
