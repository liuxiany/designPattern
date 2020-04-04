package cn.liuxiany.abstractFactory;

/**
 * 抽象工厂模式测试类
 *
 * @author liuxiany
 * @date 2020/01/16
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        System.out.println("创建1系列产品：");

        AbstractFactory abstractFactory1 = new ConcreteFactory1();

        abstractFactory1.createProductA().show();
        abstractFactory1.createProductB().show();

        System.out.println("创建2系列产品：");

        AbstractFactory abstractFactory2 = new ConcreteFactory2();

        abstractFactory2.createProductA().show();
        abstractFactory2.createProductB().show();
    }
}
