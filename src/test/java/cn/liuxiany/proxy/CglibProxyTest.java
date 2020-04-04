package cn.liuxiany.proxy;

import cn.liuxiany.proxy.cglib.AnotherSubject;
import cn.liuxiany.proxy.cglib.DynamicProxy;
import cn.liuxiany.proxy.cglib.Subject;

/**
 * cglib动态代理测试类
 *
 * @author liuxiany
 * @date 2019/09/26
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        Subject subject = new Subject();

        DynamicProxy dynamicProxy = new DynamicProxy();
        Subject subjectAfterProxy = (Subject) dynamicProxy.getInstance(subject);

        subjectAfterProxy.sayHello();

        System.out.println("====================================");

        AnotherSubject anotherSubject = new AnotherSubject();
        AnotherSubject anotherSubjectAfterProxy = (AnotherSubject) dynamicProxy.getInstance(anotherSubject);

        anotherSubjectAfterProxy.sayHello("jack");

    }
}
