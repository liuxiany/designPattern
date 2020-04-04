package cn.liuxiany.templateMethod;

/**
 * 抽象父类
 *
 * @author liuxiany
 * @date 2019/11/26
 */
public abstract class AbstractClass {

    /**
     * 模板方法
     * 给出了算法的骨架，此算法由一系列抽象步骤组成，而步骤的实现则推迟到了具体的子类中
     */
    public void templateMethod() {
        specificMethod();
        abstractMethodOne();
        abstractMethodTwo();
    }

    public void specificMethod() {
        System.out.println("抽象类中的具体方法。。。");
    }

    public abstract void abstractMethodOne();

    public abstract void abstractMethodTwo();
}
