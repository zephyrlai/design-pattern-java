package cn.zephyr.patterns.strategy.enums;

/**
 * @Author: laizonghao
 * @Description: 支付状态枚举
 * @Date: 2019-06-30 17:22
 */
public enum PayStatus {
    PAY_SUCC("PAY_SUCC","支付成功"),
    PAY_FAIL_BALANCE("PAY_FAIL_BALANCE","余额不足，支付失败"),
    PAY_FAIL_PAYTYPE_NOT_EXIST("PAY_FAIL_PAYTYPE_NOT_EXIST","支付方式不存在，支付失败"),
    ;

    private String key;
    private String desc;

    PayStatus(String key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "PayStatus{" +
                "支付状态='" + key + '\'' +
                ", 信息='" + desc + '\'' +
                '}';
    }
}
