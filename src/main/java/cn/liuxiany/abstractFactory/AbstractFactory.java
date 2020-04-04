package cn.liuxiany.abstractFactory;

/**
 * 抽象工厂类
 *
 * @author liuxiany
 * @date 2020/01/16
 */
public interface AbstractFactory {

    /**
     * 创建A种类产品
     *
     * @return
     */
    AbstractProductA createProductA();

    /**
     * 创建B种类产品
     *
     * @return
     */
    AbstractProductB createProductB();
}
