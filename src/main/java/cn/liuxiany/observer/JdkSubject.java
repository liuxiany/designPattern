package cn.liuxiany.observer;

import java.util.Observable;

/**
 * @author liuxiany
 * @date 2020/01/01
 */
public class JdkSubject extends Observable {

    private int state;

    protected void setState(int state) {
        this.state = state;

        setChanged();
        notifyObservers(state);
    }

    protected int getState() {
        return this.state;
    }
}
