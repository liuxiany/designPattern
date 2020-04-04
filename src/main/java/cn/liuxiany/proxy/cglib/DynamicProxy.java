package cn.liuxiany.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 使用cglib动态代理
 * 不需要委托类实现接口
 *
 * @author liuxiany
 * @date 2019/09/26
 */
public class DynamicProxy implements MethodInterceptor {

    //委托类引用
    private Object target;

    //创建代理类
    public Object getInstance(Object target) {
        this.target = target;

        //1. 创建核心类
        Enhancer enhancer = new Enhancer();
        //2. 设置父类。cglib是通过继承委托类的方式实现代理
        enhancer.setSuperclass(this.target.getClass());
        //3.回调方法
        //需要传入MethodInterceptor|NoOp|LazyLoader|Dispatcher|InvocationHandler|FixedValue的实现类
        enhancer.setCallback(this);
        //4.创建代理对象
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = null;

        System.out.println("事务开始======");
        result = methodProxy.invokeSuper(o, objects);
        System.out.println("事务结束======");
        return result;
    }
}
