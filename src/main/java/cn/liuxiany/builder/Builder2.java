package cn.liuxiany.builder;

/**
 * 抽象建造者（第二种方式实现）
 * <p>
 * 定义构建产品类各个组件的抽象方法
 * 各个组件的构建方法的返回值修改为了建造者类型
 *
 * @author liuxiany
 * @date 2019/12/27
 */
public abstract class Builder2 {

    public abstract Builder2 buildPartA(String message);

    public abstract Builder2 buildPartB(String message);

    public abstract Builder2 buildPartC(String message);

    public abstract Product build();
}
