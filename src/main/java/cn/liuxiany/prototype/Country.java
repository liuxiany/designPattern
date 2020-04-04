package cn.liuxiany.prototype;

import java.io.Serializable;

/**
 * 通过序列化实现深克隆
 *
 * @author liuxiany
 * @date 2019/09/29
 */
public class Country implements Serializable {

    private String name;

    private City3 city3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City3 getCity3() {
        return city3;
    }

    public void setCity3(City3 city3) {
        this.city3 = city3;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", city3=" + city3 +
                '}';
    }
}
