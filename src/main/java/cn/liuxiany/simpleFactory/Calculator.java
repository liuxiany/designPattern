package cn.liuxiany.simpleFactory;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * 简单的计算器
 *
 * @author liuxiany
 * @date 2019/09/18
 */
public class Calculator {
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

        if ("+".equals(sign)) {
            System.out.println("计算结果为：" + (firstNumber + secondNumber));
        } else if ("-".equals(sign)) {
            System.out.println("计算结果为：" + (firstNumber - secondNumber));
        } else if ("*".equals(sign)) {
            System.out.println("计算结果为：" + (firstNumber * secondNumber));
        } else if ("/".equals(sign)) {
            System.out.println("计算结果为：" + (firstNumber / secondNumber));
        } else {
            System.out.println("不支持此运算");
        }

    }
}
