package cn.liuxiany.proxy.jdk;

/**
 * 对代理对象（委托类）
 *
 * @author liuxiany
 * @date 2019/09/26
 */
public class RealSubject implements Subject {

    public void sayHello() {
        System.out.println("hello，这是jdk动态代理");
    }
}
