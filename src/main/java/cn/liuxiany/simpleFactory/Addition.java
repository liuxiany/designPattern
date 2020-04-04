package cn.liuxiany.simpleFactory;

/**
 * 加法运算
 *
 * @author liuxiany
 * @date 2019/09/19
 */
public class Addition implements Operator {

    /**
     * 实现加法运算
     *
     * @param number1 数字1
     * @param number2 数字2
     * @return 两者之和
     */
    public double compute(double number1, double number2) {
        return number1 + number2;
    }
}
