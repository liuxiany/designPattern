package cn.liuxiany.strategy;

/**
 * 打折
 *
 * @author liuxiany
 * @date 2019/09/21
 */
public class RebateStrategy implements Strategy {

    private double percent;

    public RebateStrategy(double percent) {
        this.percent = percent;
    }

    public double figureUp(double money) {
        return money * percent;
    }
}
