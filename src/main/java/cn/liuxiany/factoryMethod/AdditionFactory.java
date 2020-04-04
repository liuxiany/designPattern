package cn.liuxiany.factoryMethod;

/**
 * 加法工厂类
 *
 * @author liuxiany
 * @date 2019/09/26
 */
public class AdditionFactory implements FactoryInterface {

    public OperatorInterface createOperator() {
        return new AdditionOperator();
    }
}
