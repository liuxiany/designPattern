package cn.liuxiany.strategy;

/**
 * 策略接口
 *
 * @author liuxiany
 * @date 2019/09/21
 */
public interface Strategy {
    /**
     * 计算优惠之后的价格
     *
     * @param money
     * @return
     */
    double figureUp(double money);
}
