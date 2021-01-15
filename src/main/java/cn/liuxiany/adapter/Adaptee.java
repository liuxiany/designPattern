package cn.liuxiany.adapter;

/**
 * 旧的对象类，需要通过适配器适配达到被客户端调用的目的
 *
 * @author liuxiany
 * @date 2020/04/09
 */
public class Adaptee {

    void newRequest() {
        System.out.println("新的请求");
    }
}
