package cn.liuxiany.state;

/**
 * 状态模式测试类
 *
 * @author liuxiany
 * @date 2020/04/04
 */
public class test {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.handle();
        context.handle();
    }
}
