package cn.liuxiany.prototype;

import java.io.Serializable;

/**
 * 通过序列化实现神克隆
 *
 * @author liuxiany
 * @date 2019/09/29
 */
public class City3 implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City3{" +
                "name='" + name + '\'' +
                '}';
    }
}
