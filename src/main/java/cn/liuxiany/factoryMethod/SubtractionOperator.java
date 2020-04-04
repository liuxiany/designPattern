package cn.liuxiany.factoryMethod;

/**
 * 减法操作符
 *
 * @author liuxiany
 * @date 2019/09/26
 */
public class SubtractionOperator implements OperatorInterface {
    public double compute(double number1, double number2) {
        return number1 - number2;
    }
}
