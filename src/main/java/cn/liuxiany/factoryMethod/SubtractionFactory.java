package cn.liuxiany.factoryMethod;

/**
 * 减法工厂类
 *
 * @author liuxiany
 * @date 2019/09/26
 */
public class SubtractionFactory implements FactoryInterface {
    public OperatorInterface createOperator() {
        return new SubtractionOperator();
    }
}
