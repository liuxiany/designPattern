package cn.liuxiany.templateMethod;

/**
 * 具体子类1
 * 实现抽象父类中的方法
 *
 * @author liuxiany
 * @date 2019/11/26
 */
public class HookConcreteClass extends HookAbstractClass {

    @Override
    public void hookMethod1() {
        System.out.println("子类实现的钩子方法1。。。");
    }

    @Override
    public boolean hookMethod2() {
        return false;
    }

    @Override
    public void abstractMethodOne() {
        System.out.println("实现类1，方法1.。。");
    }

    @Override
    public void abstractMethodTwo() {
        System.out.println("实现类1，方法2.。。");
    }
}