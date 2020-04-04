package cn.liuxiany.simpleFactory;

/**
 * 运算接口
 *
 * @author liuxiany
 * @date 2019/09/19
 */
public interface Operator {

    /**
     * 运算方法
     *
     * @param number1 数字1
     * @param number2 数字2
     * @return
     */
    double compute(double number1, double number2);
}
