package cn.liuxiany.proxy.cglib;

/**
 * 委托类，并没有实现任何接口
 *
 * @author liuxiany
 * @date 2019/09/26
 */
public class Subject {

    public void sayHello() {
        System.out.println("hello，这是cglib动态代理");
    }
}
