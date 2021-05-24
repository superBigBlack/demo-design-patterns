package prototype;

import prototype.framework.Product;

/**
 * @Description TODO
 * @Author SuperDaHei
 * @Date 2021-05-24 22:34
 */
public class PrintName extends Product {

    private String name;

    public PrintName(String name) {
        this.name = name;
    }

    @Override
    public void printStr() {
        System.out.println("我是：" + name);
    }

    @Override
    public Product createClone() {
        try {
            return (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
