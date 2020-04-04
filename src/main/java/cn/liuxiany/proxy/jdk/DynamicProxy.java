package cn.liuxiany.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理
 * 需要实现InvocationHandler接口
 *
 * @author liuxiany
 * @date 2019/09/25
 */
public class DynamicProxy implements InvocationHandler {

    //被代理对象的引用
    private Object target;

    public Object bind(Object target) {
        this.target = target;

        //限制了委托类必须实现接口
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;

        System.out.println("事务开始========");
        result = method.invoke(target, args);
        System.out.println("事务结束========");

        return result;
    }
}
