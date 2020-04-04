package cn.liuxiany.observer;

/**
 * @author liuxiany
 * @date 2020/01/01
 */
public class ConcreteSubject extends Subject {

    /**
     * 实现更新方法，当具体主题类发生改变时，更新观察者的状态
     */
    protected void notifyObserver() {
        System.out.println("主题发生了改变，需要通知所有观察者");

        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
