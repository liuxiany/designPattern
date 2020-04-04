package cn.liuxiany.observer;

/**
 * 观察者模式测试类
 *
 * @author liuxiany
 * @date 2020/01/01
 */
public class JdkObserverTest {
    public static void main(String[] args) {
        JdkSubject subject = new JdkSubject();

        JdkObserver1 jdkObserver1 = new JdkObserver1();
        JdkObserver2 jdkObserver2 = new JdkObserver2();

        subject.addObserver(jdkObserver1);
        subject.addObserver(jdkObserver2);

        subject.setState(10);

        System.out.println("============");
        subject.deleteObserver(jdkObserver1);

        subject.setState(20);
    }
}
