package cn.liuxiany.strategy;

/**
 * 按原价
 *
 * @author liuxiany
 * @date 2019/09/21
 */
public class NormalStrategy implements Strategy {

    public double figureUp(double money) {
        return money;
    }
}
