package cn.liuxiany.builder;

/**
 * 指挥者
 *
 * @author liuxiany
 * @date 2019/12/28
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 创建Product实例
     *
     * @return
     */
    public Product construct() {
        this.builder.buildPartA();
        this.builder.buildPartB();
        this.builder.buildPartC();

        return this.builder.getResult();
    }
}
