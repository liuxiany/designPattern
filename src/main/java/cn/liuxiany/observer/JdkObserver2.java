package cn.liuxiany.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体观察者2
 *
 * @author liuxiany
 * @date 2020/01/01
 */
public class JdkObserver2 implements Observer {

    public void update(Observable o, Object arg) {
        System.out.println("主题当前状态为：" + ((JdkSubject) o).getState() + "，目标状态为：" + arg);
    }
}
