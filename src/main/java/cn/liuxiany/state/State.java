package cn.liuxiany.state;

/**
 * 状态抽象类
 *
 * @author liuxiany
 * @date 2020/03/31
 */
public abstract class State {

    public abstract void handle(Context context);
}
