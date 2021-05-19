package factory.framework;

/**
 * @Description
 *          工厂基本类，具有 create()方法；以及生产产品createProduct()，注册产品registerProduct()的基本属性
 *
 * @Author SuperDaHei
 * @Date 2021-05-19 21:17
 */
public abstract class Factory {

    public Product create(String name){
        Product product = createProduct(name);
        registerProduct(product);
        return product;
    }

    public abstract Product createProduct(String name);

    public abstract void registerProduct(Product product);
}
