package cn.liuxiany.strategy;

import java.util.Scanner;

/**
 * 超市收银员
 *
 * @author liuxiany
 * @date 2019/09/20
 */
public class Cashier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0, price = 0, number = 0;

        do {
            System.out.print("请输入商品单价：");
            price = scanner.nextDouble();

            System.out.print("请输入商品数目：");
            number = scanner.nextInt();

            totalPrice += price * number;

            System.out.print("是否结束（y/n）：");
            scanner.nextLine();

        } while ("n".equals(scanner.nextLine()));

        System.out.print("总价格为：" + totalPrice);
    }
}
