package cn.liuxiany.proxy;

import cn.liuxiany.proxy.jdk.AnotherRealSubject;
import cn.liuxiany.proxy.jdk.DynamicProxy;
import cn.liuxiany.proxy.jdk.RealSubject;
import cn.liuxiany.proxy.jdk.Subject;

/**
 * jdk动态代理测试类
 *
 * @author liuxiany
 * @date 2019/09/26
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();

        DynamicProxy dynamicProxy = new DynamicProxy();
        Subject subject = (Subject) dynamicProxy.bind(realSubject);

        subject.sayHello();

        System.out.println("====================================");

        AnotherRealSubject anotherRealSubject = new AnotherRealSubject();

        Subject anotherSubject = (Subject) dynamicProxy.bind(anotherRealSubject);

        anotherSubject.sayHello();

    }
}
