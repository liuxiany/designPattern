package cn.liuxiany.templateMethod;

/**
 * 模板方法测试类
 *
 * @author liuxiany
 * @date 2019/11/27
 */
public class HookTemplateMethodTest {

    public static void main(String[] args) {
        HookAbstractClass abstractClass = null;

        abstractClass = new HookConcreteClass();
        abstractClass.templateMethod();
    }
}
