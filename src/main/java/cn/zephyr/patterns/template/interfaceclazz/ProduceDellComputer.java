package cn.zephyr.patterns.template.interfaceclazz;

/**
 * @Author: laizonghao
 * @Description:
 * @Date: 2019-06-30 21:26
 */
public class ProduceDellComputer implements ProduceComputer {
    @Override
    public void buyCPU() {
        System.err.println("购买AMD处理器");
    }

    @Override
    public void buyMainboard() {
        System.err.println("购买主板");
    }

    @Override
    public void assemble() {
        System.err.println("组装Dell电脑");
    }

    @Override
    public void installOS() {
        System.err.println("安装Windows系统");
    }
}
