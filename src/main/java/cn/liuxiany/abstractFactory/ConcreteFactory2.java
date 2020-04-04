package cn.liuxiany.abstractFactory;

/**
 * 具体工厂类2
 *
 * @author liuxiany
 * @date 2020/01/16
 */
public class ConcreteFactory2 implements AbstractFactory {

    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
