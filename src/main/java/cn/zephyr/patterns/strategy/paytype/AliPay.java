package cn.zephyr.patterns.strategy.paytype;

import cn.zephyr.patterns.strategy.enums.PayStatus;
import cn.zephyr.patterns.strategy.order.Order;

/**
 * @Author: laizonghao
 * @Description:
 * @Date: 2019-06-30 17:25
 */
public class AliPay implements IPayType {

    private Double accountBalance = 500D;

    @Override
    public PayStatus pay(Order order) {
        System.err.println("即将为订单号为"+order.getUuid()+"的订单进行支付");
        System.err.println("支付方式:支付宝，账户余额"+accountBalance+",订单金额："+order.getPayment());
        if(this.accountBalance>=order.getPayment()){
            return PayStatus.PAY_SUCC;
        }
        return PayStatus.PAY_FAIL_BALANCE;
    }
}
