package cn.zephyr.patterns.strategy.paytype;

import cn.zephyr.patterns.strategy.enums.PayStatus;
import cn.zephyr.patterns.strategy.order.Order;
import lombok.Data;

/**
 * @Author: laizonghao
 * @Description:
 * @Date: 2019-06-30 17:49
 */
@Data
public class WechatPay implements IPayType {

    private Double accountBalance = 100D;

    @Override
    public PayStatus pay(Order order) {
        System.err.println("即将为订单号为"+order.getUuid()+"的订单进行支付");
        System.err.println("支付方式:微信支付，账户余额"+accountBalance+",订单金额："+order.getPayment());
        if(this.accountBalance>=order.getPayment()){
            return PayStatus.PAY_SUCC;
        }
        return PayStatus.PAY_FAIL_BALANCE;
    }
}
