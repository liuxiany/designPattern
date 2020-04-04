package cn.liuxiany.facade;

/**
 * 外观类
 *
 * @author liuxiany
 * @date 2019/11/30
 */
public class Facade {

    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;

    /**
     * 初始化各个子系统
     * 只是为了demo的演示，真实开发中并不会这么做
     */
    public Facade() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
    }

    /**
     * 为子系统1的方法提供了统一的方法
     */
    public void methodOne() {
        subSystemOne.methodOne();
        subSystemOne.methodTwo();
    }

    /**
     * 为子系统2的方法提供了统一的方法
     */
    public void methodTwo() {
        subSystemTwo.methodOne();
        subSystemTwo.methodTwo();
    }
}
