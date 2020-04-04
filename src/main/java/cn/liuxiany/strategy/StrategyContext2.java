package cn.liuxiany.strategy;

/**
 * 策略上下文
 * 与简单工厂模式融合
 *
 * @author liuxiany
 * @date 2019/09/21
 */
public class StrategyContext2 {

    private Strategy strategy;

    public StrategyContext2(int strategyType){
        switch (strategyType) {
            case 1:
                strategy = new NormalStrategy();
                break;
            case 2:
                strategy = new RebateStrategy(0.9);
                break;
            case 3:
                strategy = new ReturnStrategy(200, 50);
                break;
        }
    }

    public double compute(double money){
        return strategy.figureUp(money);
    }
}
