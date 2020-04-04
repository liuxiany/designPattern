package cn.liuxiany.prototype;

/**
 * 原型模式测试类
 *
 * @author liuxiany
 * @date 2019/09/27
 */
public class Prototype2Test {
    public static void main(String[] args) {
        City2 city2 = new City2();
        Prototype2 prototype2 = new Prototype2("jack", city2);

        try {
            Prototype2 prototype2Cloned = (Prototype2) prototype2.clone();
            prototype2Cloned.setName("tom");
            System.out.println(prototype2);
            System.out.println(prototype2.getCity2());

            System.out.println(prototype2Cloned);
            System.out.println(prototype2Cloned.getName());
            System.out.println(prototype2Cloned.getCity2());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
