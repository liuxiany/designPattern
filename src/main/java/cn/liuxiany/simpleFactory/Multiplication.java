package cn.liuxiany.simpleFactory;

/**
 * 乘法运算
 *
 * @author liuxiany
 * @date 2019/09/19
 */
public class Multiplication implements Operator {

    /**
     * 实现乘法运算
     *
     * @param number1 数字1
     * @param number2 数字2
     * @return
     */
    public double compute(double number1, double number2) {
        return number1 * number2;
    }
}
