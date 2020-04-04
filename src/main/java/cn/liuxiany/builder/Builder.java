package cn.liuxiany.builder;

/**
 * 抽象建造者
 * <p>
 * 定义构建产品类各个组件的抽象方法
 *
 * @author liuxiany
 * @date 2019/12/27
 */
public abstract class Builder {

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public abstract Product getResult();
}
