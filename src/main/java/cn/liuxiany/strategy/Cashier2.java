package cn.liuxiany.strategy;

import java.util.Scanner;

/**
 * 超市收银员2
 *
 * @author liuxiany
 * @date 2019/09/21
 */
public class Cashier2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0, price = 0, number = 0, discount = 0;

        do {
            System.out.print("请输入商品单价：");
            price = scanner.nextDouble();

            System.out.print("请输入商品数目：");
            number = scanner.nextInt();

            System.out.print("请输入打折（小数）：");
            discount = scanner.nextDouble();
            discount = discount <= 0 ? 1 : discount;

            totalPrice += price * number * discount;

            System.out.print("是否结束（y/n）：");
            scanner.nextLine();

        } while ("n".equals(scanner.nextLine()));

        System.out.print("总价格为：" + totalPrice);
    }
}
