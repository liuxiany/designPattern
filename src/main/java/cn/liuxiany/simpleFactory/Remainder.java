package cn.liuxiany.simpleFactory;

/**
 * 求余数
 *
 * @author liuxiany
 * @date 2019/09/19
 */
public class Remainder implements Operator {

    /**
     * 实现求余数运算
     */
    public double compute(double number1, double number2) {
        return number1 % number2;
    }
}
