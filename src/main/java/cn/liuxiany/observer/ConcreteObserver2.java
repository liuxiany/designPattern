package cn.liuxiany.observer;

/**
 * 具体观察者2
 * 实现更新自身的方法
 *
 * @author liuxiany
 * @date 2020/01/01
 */
public class ConcreteObserver2 implements Observer {

    public void update() {
        System.out.println("具体观察者2得到了通知，实现了自身的更新");
    }
}
