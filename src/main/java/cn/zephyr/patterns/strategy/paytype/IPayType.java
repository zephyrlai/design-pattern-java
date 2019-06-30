package cn.zephyr.patterns.strategy.paytype;

import cn.zephyr.patterns.strategy.enums.PayStatus;
import cn.zephyr.patterns.strategy.order.Order;

/**
 * @Author: laizonghao
 * @Description:
 * @Date: 2019-06-30 17:22
 */
public interface IPayType {

    PayStatus pay(Order order);
}
