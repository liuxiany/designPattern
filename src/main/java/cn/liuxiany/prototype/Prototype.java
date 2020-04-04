package cn.liuxiany.prototype;

/**
 * 原型类
 * 实现 Cloneable 接口就可实现对象的浅克隆
 * @author liuxiany
 * @date 2019/09/27
 */
public class Prototype implements Cloneable {

    private String name;

    private City city;

    public Prototype() {
    }

    public Prototype(String name,City city) {
        this.name = name;
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public City getCity() {
        return this.city;
    }
}
