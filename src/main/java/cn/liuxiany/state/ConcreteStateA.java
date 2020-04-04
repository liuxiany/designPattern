package cn.liuxiany.state;

/**
 * 具体状态类A
 *
 * @author liuxiany
 * @date 2020/04/04
 */
public class ConcreteStateA extends State {

    public void handle(Context context) {
        System.out.println("当前的状态为A");
        context.setState(new ConcreteStateB());
    }
}
