package cn.liuxiany.builder;

/**
 * 第二种方式实现的建造者模式测试类
 *
 * @author liuxiany
 * @date 2019/12/28
 */
public class Builder2Test {

    public static void main(String[] args) {
        Builder2 builder2 = new ConcreteBuilder3();

        Product product = builder2.buildPartA("A组件").buildPartB("B组件").buildPartC("C组件").build();

        product.show();
    }
}