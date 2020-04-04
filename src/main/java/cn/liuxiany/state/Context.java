package cn.liuxiany.state;

/**
 * 环境类
 *
 * @author liuxiany
 * @date 2020/04/04
 */
public class Context {

    // 状态抽象类引用
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handle() {
        this.state.handle(this);
    }
}
