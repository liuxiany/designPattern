package cn.liuxiany.templateMethod;

/**
 * 抽象父类
 * 含有钩子方法
 *
 * @author liuxiany
 * @date 2019/11/26
 */
public abstract class HookAbstractClass {

    /**
     * 模板方法
     * 给出了算法的骨架，此算法由一系列抽象步骤组成，而步骤的实现则推迟到了具体的子类中
     * 子类可以通过重写钩子方法来控制父类的模板方法的执行结果
     */
    public void templateMethod() {
        hookMethod1();

        if (hookMethod2()) {
            specificMethod();
        }

        abstractMethodOne();
        abstractMethodTwo();
    }

    public void specificMethod() {
        System.out.println("抽象类中的具体方法。。。");
    }

    /**
     * 钩子方法1
     */
    public abstract void hookMethod1();

    /**
     * 钩子方法2
     *
     * @return
     */
    public abstract boolean hookMethod2();

    public abstract void abstractMethodOne();

    public abstract void abstractMethodTwo();
}
