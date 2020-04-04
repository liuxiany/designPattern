package cn.liuxiany.builder;

/**
 * 产品类
 * 包含多个组成部分的复杂对象
 *
 * @author liuxiany
 * @date 2019/12/27
 */
public class Product {
    public String partA;
    public String partB;
    public String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void show() {
        System.out.println("该产品由" + partA + "," + partB + "," + partC + "组成");
    }
}
