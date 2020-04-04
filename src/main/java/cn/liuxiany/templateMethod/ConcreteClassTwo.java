package cn.liuxiany.templateMethod;

/**
 * 具体子类1
 * 实现抽象父类中的方法
 *
 * @author liuxiany
 * @date 2019/11/26
 */
public class ConcreteClassTwo extends AbstractClass {

    @Override
    public void abstractMethodOne() {
        System.out.println("实现类2，方法1.。。");
    }

    @Override
    public void abstractMethodTwo() {
        System.out.println("实现类2，方法2.。。");
    }
}