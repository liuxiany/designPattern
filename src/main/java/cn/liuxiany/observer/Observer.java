package cn.liuxiany.observer;

/**
 * 观察者接口
 * 定义更新自身的方法，当主题改变时，更新自身
 *
 * @author liuxiany
 * @date 2020/01/01
 */
public interface Observer {

    void update();
}
