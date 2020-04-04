package cn.liuxiany.simpleFactory;

/**
 * 除法运算
 *
 * @author liuxiany
 * @date 2019/09/19
 */
public class Division implements Operator {

    /**
     * 实现出发运算
     *
     * @param number1 数字1
     * @param number2 数字2
     * @return
     */
    public double compute(double number1, double number2) {

        if (number2 == 0) {
            System.out.println("除数不能为0");
        }

        return number1 / number2;
    }
}
