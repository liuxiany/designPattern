package cn.liuxiany.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题类
 * 包含观察者聚簇，添加和删除观察者方法，通知观察者的方法
 *
 * @author liuxiany
 * @date 2020/01/01
 */
public abstract class Subject {

    protected List<Observer> observerList = new ArrayList<Observer>();

    protected void attach(Observer observer) {
        observerList.add(observer);
    }

    protected void detach(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 通知所有注册的观察者
     */
    protected abstract void notifyObserver();
}
