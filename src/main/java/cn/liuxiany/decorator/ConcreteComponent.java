package cn.liuxiany.decorator;

/**
 * 待装类的具体实现类
 *
 * @author liuxiany
 * @date 2019/09/24
 */
public class ConcreteComponent implements Component {

    public ConcreteComponent() {}

    public void operation() {
        System.out.println("被装饰对象的operation方法执行");
    }
}