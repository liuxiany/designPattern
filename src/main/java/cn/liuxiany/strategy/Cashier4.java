package cn.liuxiany.strategy;

import java.util.Scanner;

/**
 * @author liuxiany
 * @date 2019/09/21
 */
public class Cashier4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0, price = 0, number = 0;
        int discount = 0;

        StrategyContext2 strategyContext2 = null;

        do {
            System.out.print("请输入商品单价：");
            price = scanner.nextDouble();

            System.out.print("请输入商品数目：");
            number = scanner.nextInt();

            System.out.print("请输入优惠策略(1:正常，2：打9折，3：满200减50)：");
            discount = scanner.nextInt();

            strategyContext2 = new StrategyContext2(discount);
            price = strategyContext2.compute(price);

            totalPrice += price * number;

            System.out.print("是否结束（y/n）：");
            scanner.nextLine();

        } while ("n".equals(scanner.nextLine()));

        System.out.print("总价格为：" + totalPrice);
    }
}
