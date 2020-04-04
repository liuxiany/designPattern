package cn.liuxiany.proxy;

/**
 * 被代理对象
 *
 * @author liuxiany
 * @date 2019/09/25
 */
public class RealSubject implements Subject {

    public void print() {
        System.out.println("被代理对象方法执行");
    }
}
