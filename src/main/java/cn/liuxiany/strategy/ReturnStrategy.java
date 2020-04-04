package cn.liuxiany.strategy;

/**
 * 满减
 *
 * @author liuxiany
 * @date 2019/09/21
 */
public class ReturnStrategy implements Strategy {

    private double conditionNumber;
    private double discountNumber;

    public ReturnStrategy(double conditionNumber, double discountNumber) {
        this.conditionNumber = conditionNumber;
        this.discountNumber = discountNumber;
    }

    public double figureUp(double money) {

        if (money < conditionNumber) {
            return money;
        }

        double number = Math.floor(money / conditionNumber);

        return money - number * discountNumber;
    }
}
