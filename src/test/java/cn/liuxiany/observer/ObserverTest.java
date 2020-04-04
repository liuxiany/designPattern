package cn.liuxiany.observer;

/**
 * 观察者模式测试类
 *
 * @author liuxiany
 * @date 2020/01/01
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        ConcreteObserver1 concreteObserver1 = new ConcreteObserver1();
        ConcreteObserver2 concreteObserver2 = new ConcreteObserver2();

        subject.attach(concreteObserver1);
        subject.attach(concreteObserver2);

        subject.notifyObserver();

        subject.detach(concreteObserver1);

        subject.notifyObserver();
    }
}
