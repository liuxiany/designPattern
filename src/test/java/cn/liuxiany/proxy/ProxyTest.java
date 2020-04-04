package cn.liuxiany.proxy;

/**
 * 代理模式测试类
 *
 * @author liuxiany
 * @date 2019/09/25
 */
public class ProxyTest {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);

        proxy.print();
    }
}
