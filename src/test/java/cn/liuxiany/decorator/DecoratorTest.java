package cn.liuxiany.decorator;

/**
 * 装饰器模式测试类
 *
 * @author liuxiany
 * @date 2019/09/25
 */
public class DecoratorTest {
    public static void main(String[] args) {

        Component component = new ConcreteComponent();

        Decorator decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operation();

        System.out.println("----------------------------------");

        Decorator decoratorB = new ConcreteDecoratorB(component);
        decoratorB.operation();
    }
}
