package cn.liuxiany.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 原型模式测试类
 *
 * @author liuxiany
 * @date 2019/09/27
 */
public class DeepCloneTest {
    public static void main(String[] args) throws Exception{

        City3 city3 = new City3();
        city3.setName("beijing");

        Country country = new Country();
        country.setName("china");
        country.setCity3(city3);

        System.out.println(country);

        //序列化
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(country);

        //反序列化
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        Country countryClone = (Country) oi.readObject();

        System.out.println(countryClone);
    }
}
