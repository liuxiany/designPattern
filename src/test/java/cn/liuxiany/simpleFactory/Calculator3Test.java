package cn.liuxiany.simpleFactory;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * 计算器3测试类
 *
 * @author liuxiany
 * @date 2019/09/19
 */
public class Calculator3Test {

    public static void main(String[] args) {
        OperatorFactory operatorFactory = new OperatorFactory();

        double firstNumber = 0, secondNumber = 0;
        String sign = null;

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));

        System.out.print("请输入第一个数字：");
        firstNumber = Double.valueOf(scanner.nextLine());

        System.out.print("请输入运算符：（+-*/%）");
        Operator operator = operatorFactory.getOperator(scanner.nextLine());

        System.out.print("请输入第二个数字：");
        secondNumber = Double.valueOf(scanner.nextLine());

        System.out.println("运算结果为：" + operator.compute(firstNumber, secondNumber));
    }
}
