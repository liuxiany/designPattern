package cn.liuxiany.simpleFactory;

/**
 * 计算器运算类
 *
 * @author liuxiany
 * @date 2019/09/19
 */
public class Operation {

    /**
     * 计算器运算方法
     *
     * @param number1  数字1
     * @param number2  数字2
     * @param operator 运算符
     * @return 运算结果
     */
    public double operation(double number1, double number2, String operator) {

        double result = 0;

        if ("+".equals(operator)) {
            result = number1 + number2;
        } else if ("-".equals(operator)) {
            result = number1 - number2;
        } else if ("*".equals(operator)) {
            result = number1 * number2;
        } else if ("/".equals(operator)) {
            result = number1 / number2;
        } else {
            System.out.println("不支持此运算");
        }

        return result;
    }
}
