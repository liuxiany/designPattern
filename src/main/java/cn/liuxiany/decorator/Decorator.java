package cn.liuxiany.decorator;

/**
 * 抽象装饰器类
 *
 * @author liuxiany
 * @date 2019/09/24
 */
public abstract class Decorator implements Component {

    private Component component;

    public Decorator() {
    }

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        System.out.println("装饰器抽象父类方法执行");

        if (component != null) {
            component.operation();
        }
    }
}
