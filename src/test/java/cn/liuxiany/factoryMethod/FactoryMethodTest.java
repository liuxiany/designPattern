package cn.liuxiany.factoryMethod;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * 工厂方法模式测试类
 *
 * @author liuxiany
 * @date 2019/09/26
 */
public class FactoryMethodTest {
    public static void main(String[] args) {

        double firstNumber = 0, secondNumber = 0;
        String sign = null;

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));

        System.out.print("请输入第一个数字：");
        firstNumber = Double.valueOf(scanner.nextLine());

        System.out.print("请输入运算符：（+-）");
        sign = scanner.nextLine();

        System.out.print("请输入第二个数字：");
        secondNumber = Double.valueOf(scanner.nextLine());

        FactoryInterface factory = null;
        OperatorInterface operator = null;

        if ("+".equals(sign)) {
            factory = new AdditionFactory();
        } else if ("-".equals(sign)) {
            factory = new SubtractionFactory();
        }

        operator = factory.createOperator();
        System.out.println("计算结果为：" + operator.compute(firstNumber, secondNumber));
    }
}
