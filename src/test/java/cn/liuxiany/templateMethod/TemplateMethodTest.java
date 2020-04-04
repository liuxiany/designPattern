package cn.liuxiany.templateMethod;

/**
 * 模板方法测试类
 *
 * @author liuxiany
 * @date 2019/11/27
 */
public class TemplateMethodTest {

    public static void main(String[] args) {
        AbstractClass abstractClass = null;

        abstractClass = new ConcreteClassOne();
        abstractClass.templateMethod();

        abstractClass = new ConcreteClassTwo();
        abstractClass.templateMethod();
    }
}
