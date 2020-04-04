package cn.liuxiany.builder;

/**
 * 具体建造者2
 * 实现抽象建造者的方法，以建造产品的各个组件
 *
 * @author liuxiany
 * @date 2019/12/27
 */
public class ConcreteBuilder2 extends Builder {

    private Product product;

    public ConcreteBuilder2() {
        product = new Product();
    }

    public void buildPartA() {
        product.setPartA("构建组件AA");
    }

    public void buildPartB() {
        product.setPartB("构建组件BB");
    }

    public void buildPartC() {
        product.setPartC("构建组件CC");
    }

    public Product getResult() {
        return product;
    }
}
