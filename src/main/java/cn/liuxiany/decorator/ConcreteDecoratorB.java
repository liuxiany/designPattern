package cn.liuxiany.decorator;

/**
 * 装饰器对象B
 *
 * @author liuxiany
 * @date 2019/09/25
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB() {
    }

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("装饰器对象B的operation方法执行");
        super.operation();
        addedFunction();
    }

    public void addedFunction() {
        System.out.println("装饰器对象B额外的方法执行");
    }
}
