package cn.liuxiany.strategy;

import java.util.Scanner;

/**
 * 收银员3
 * 利用策略模式
 *
 * @author liuxiany
 * @date 2019/09/21
 */
public class Cashier3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0, price = 0, number = 0;
        int discount = 0;

        StrategyContext strategyContext = null;

        do {
            System.out.print("请输入商品单价：");
            price = scanner.nextDouble();

            System.out.print("请输入商品数目：");
            number = scanner.nextInt();

            System.out.print("请输入优惠策略(1:正常，2：打9折，3：满200减50)：");
            discount = scanner.nextInt();

            switch (discount) {
                case 1:
                    strategyContext = new StrategyContext(new NormalStrategy());
                    price = strategyContext.compute(price);
                    break;
                case 2:
                    strategyContext = new StrategyContext(new RebateStrategy(0.9));
                    price = strategyContext.compute(price);
                    break;
                case 3:
                    strategyContext = new StrategyContext(new ReturnStrategy(200, 50));
                    price = strategyContext.compute(price);
                    break;
            }

            totalPrice += price * number;

            System.out.print("是否结束（y/n）：");
            scanner.nextLine();

        } while ("n".equals(scanner.nextLine()));

        System.out.print("总价格为：" + totalPrice);
    }
}