package cn.liuxiany.builder;

/**
 * 建造者模式测试类
 *
 * @author liuxiany
 * @date 2019/12/28
 */
public class BuilderTest {

    public static void main(String[] args) {
        Builder builder1 = new ConcreteBuilder1();

        Director director1 = new Director(builder1);

        Product product1 = director1.construct();

        product1.show();

        Builder builder2 = new ConcreteBuilder2();

        Director director2 = new Director(builder2);

        Product product2 = director2.construct();

        product2.show();
    }
}
