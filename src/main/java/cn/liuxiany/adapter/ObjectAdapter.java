package cn.liuxiany.adapter;

/**
 * 对象适配器
 *
 * @author liuxiany
 * @date 2020/04/09
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        System.out.println("进入适配器");
        adaptee.newRequest();
    }
}
