package cn.liuxiany.decorator;

/**
 * 装饰器对象A
 *
 * @author liuxiany
 * @date 2019/09/24
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA() {
    }

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("装饰器对象A的operation方法执行");
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("装饰器对象A额外的方法执行");
    }
}
