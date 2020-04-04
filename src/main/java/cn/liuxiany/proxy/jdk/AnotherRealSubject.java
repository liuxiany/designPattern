package cn.liuxiany.proxy.jdk;

/**
 * 另一个jdk动态代理委托类
 *
 * @author liuxiany
 * @date 2019/09/26
 */
public class AnotherRealSubject implements Subject {

    public void sayHello() {
        System.out.println("hello，另一个jdk动态代理");
    }
}
