package cn.liuxiany.proxy.cglib;

/**
 * 另一个委托类
 *
 * @author liuxiany
 * @date 2019/09/26
 */
public class AnotherSubject {

    public void sayHello(String name) {
        System.out.println("hello " + name + "，这是另一个cglib动态代理");
    }
}
