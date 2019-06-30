package cn.zephyr.patterns.strategy.order;

import cn.zephyr.patterns.strategy.enums.PayStatus;
import cn.zephyr.patterns.strategy.enums.PayTypeEnum;
import cn.zephyr.patterns.strategy.paytype.IPayType;
import lombok.Data;

/**
 * @Author: laizonghao
 * @Description:
 * @Date: 2019-06-30 17:33
 */
@Data
public class Order {
    // 订单号
    private String uuid;
    // 总价
    private Double payment;
    // 支付方式
    private PayTypeEnum payTypeEnum;

    public Order() {
    }

    public Order(String uuid, Double payment, PayTypeEnum payTypeEnum) {
        this.uuid = uuid;
        this.payment = payment;
        this.payTypeEnum = payTypeEnum;
    }

    public PayStatus getPaid(){
        if(null == this.getPayTypeEnum()){
            return PayStatus.PAY_FAIL_PAYTYPE_NOT_EXIST;
        }
        return payTypeEnum.getiPayType().pay(this);
    }
}
