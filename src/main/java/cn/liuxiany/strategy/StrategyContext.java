package cn.liuxiany.strategy;

/**
 * 策略上下文
 *
 * @author liuxiany
 * @date 2019/09/21
 */
public class StrategyContext {

    private Strategy strategy;

    public StrategyContext(Strategy strategy){
        this.strategy = strategy;
    }

    public double compute(double money){
        return strategy.figureUp(money);
    }
}
