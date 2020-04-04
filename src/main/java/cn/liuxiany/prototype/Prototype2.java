package cn.liuxiany.prototype;

/**
 * 原型类
 * 实现 Cloneable 接口就可实现对象的浅克隆
 * City对象重写clone方法实现深克隆
 *
 * @author liuxiany
 * @date 2019/09/27
 */
public class Prototype2 implements Cloneable {

    private String name;

    private City2 city2;

    public Prototype2() {
    }

    public Prototype2(String name, City2 city2) {
        this.name = name;
        this.city2 = city2;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Prototype2 prototype2 = (Prototype2) super.clone();

        prototype2.setCity2((City2) this.city2.clone());

        return prototype2;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public City2 getCity2() {
        return this.city2;
    }

    public void setCity2(City2 city2) {
        this.city2 = city2;
    }
}
