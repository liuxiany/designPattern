package cn.liuxiany.facade;

/**
 * 外观模式测试类
 *
 * @author liuxiany
 * @date 2019/11/30
 */
public class FacadeTest {

    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.methodOne();
        System.out.println("-----------");
        facade.methodTwo();
    }
}
