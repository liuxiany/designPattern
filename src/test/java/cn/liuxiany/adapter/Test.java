package cn.liuxiany.adapter;

/**
 * 适配器测试类
 * 充当客户端角色
 *
 * @author liuxiany
 * @date 2020/04/09
 */
public class Test {
    public static void main(String[] args) {

        Adaptee adaptee = new Adaptee();
        ObjectAdapter objectAdapter = new ObjectAdapter(adaptee);

        // 通过适配器调用原对象
        objectAdapter.request();
    }
}
