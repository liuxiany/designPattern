package cn.liuxiany.proxy;

/**
 * @author liuxiany
 * @date 2019/09/25
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    public Proxy() {
    }

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void print() {
        System.out.println("进入代理类方法");

        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.print();

        System.out.println("代理类方法执行完毕");
    }
}
