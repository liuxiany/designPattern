package cn.liuxiany.prototype;

/**
 * 原型模式测试类
 *
 * @author liuxiany
 * @date 2019/09/27
 */
public class PrototypeTest {
    public static void main(String[] args) {
        City city = new City();
        Prototype prototype = new Prototype("jack", city);

        try {
            Prototype prototypeCloned = (Prototype) prototype.clone();
            prototypeCloned.setName("tom");
            System.out.println(prototype);
            System.out.println(prototype.getCity());

            System.out.println(prototypeCloned);
            System.out.println(prototypeCloned.getName());
            System.out.println(prototypeCloned.getCity());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
