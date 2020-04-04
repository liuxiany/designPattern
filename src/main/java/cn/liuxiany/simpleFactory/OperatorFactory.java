package cn.liuxiany.simpleFactory;

/**
 * 运算的工厂类
 *
 * @author liuxiany
 * @date 2019/09/19
 */
public class OperatorFactory {

    /**
     * 根据运算符得到运算类
     *
     * @param operator 运算符
     * @return
     */
    public Operator getOperator(String operator) {

        if ("+".equals(operator)) {
            return new Addition();
        } else if ("-".equals(operator)) {
            return new Subtraction();
        } else if ("*".equals(operator)) {
            return new Multiplication();
        } else if ("/".equals(operator)) {
            return new Division();
        } else if ("%".equals(operator)) {
            return new Remainder();
        } else {
            System.out.println("不支持此运算");
            return null;
        }
    }
}
