package cn.liuxiany.simpleFactory;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * 计算器2的测试类
 *
 * @author liuxiany
 * @date 2019/09/19
 */
public class Calculator2Test {

    public static void main(String[] args) {
        double firstNumber = 0, secondNumber = 0;
        String sign = null;

        Scanner scanner = new Scanner(new BufferedInputStream(System.in));

        System.out.print("请输入第一个数字：");
        firstNumber = Double.valueOf(scanner.nextLine());

        System.out.print("请输入运算符：（+-*/）");
        sign = scanner.nextLine();

        System.out.print("请输入第二个数字：");
        secondNumber = Double.valueOf(scanner.nextLine());

        Operation operation = new Operation();
        double result = operation.operation(firstNumber, secondNumber, sign);

        System.out.println("计算结果为：" + result);
    }
}
