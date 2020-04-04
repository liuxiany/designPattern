package cn.liuxiany.builder;

/**
 * 第二种方式实现建造者模式
 * <p>
 * 在这种模式中，将Director去掉，将其权力转移到了调用方。
 *
 * @author liuxiany
 * @date 2019/12/28
 */
public class ConcreteBuilder3 extends Builder2 {

    private Product product;

    public ConcreteBuilder3() {
        product = new Product();
    }

    public Builder2 buildPartA(String message) {
        product.setPartA(message);
        return this;
    }

    public Builder2 buildPartB(String message) {
        product.setPartB(message);
        return this;
    }

    public Builder2 buildPartC(String message) {
        product.setPartC(message);
        return this;
    }

    public Product build() {
        return product;
    }
}
