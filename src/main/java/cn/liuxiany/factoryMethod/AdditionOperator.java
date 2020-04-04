package cn.liuxiany.factoryMethod;

/**
 * 加法操作
 *
 * @author liuxiany
 * @date 2019/09/26
 */
public class AdditionOperator implements OperatorInterface {
    public double compute(double number1, double number2) {
        return number1 + number2;
    }
}
