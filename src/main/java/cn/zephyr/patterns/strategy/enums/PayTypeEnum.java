package cn.zephyr.patterns.strategy.enums;

import cn.zephyr.patterns.strategy.paytype.AliPay;
import cn.zephyr.patterns.strategy.paytype.IPayType;
import cn.zephyr.patterns.strategy.paytype.WechatPay;

/**
 * @Author: laizonghao
 * @Description: 支付方式枚举
 * @Date: 2019-06-30 17:19
 */
public enum PayTypeEnum {
    /**
     * 支付宝
     */
    ALIPAY(new AliPay()),
    /**
     * 微信支付
     */
    WECHATPAY(new WechatPay()),
    ;

    private IPayType iPayType;

    PayTypeEnum(IPayType iPayType) {
        this.iPayType = iPayType;
    }

    public IPayType getiPayType() {
        return iPayType;
    }

    public void setiPayType(IPayType iPayType) {
        this.iPayType = iPayType;
    }
}
