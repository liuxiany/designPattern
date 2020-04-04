package cn.liuxiany.abstractFactory;

/**
 * 具体工厂类1
 *
 * @author liuxiany
 * @date 2020/01/16
 */
public class ConcreteFactory1 implements AbstractFactory {

    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
