package cn.liuxiany.prototype;

/**
 * 实现深克隆
 *
 * @author liuxiany
 * @date 2019/09/29
 */
public class City2 implements Cloneable {

    private String name;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
