package cn.liuxiany.state;

/**
 * 具体状态类B
 *
 * @author liuxiany
 * @date 2020/04/04
 */
public class ConcreteStateB extends State {

    public void handle(Context context) {
        System.out.println("当前的状态为B");
        context.setState(new ConcreteStateA());
    }
}
