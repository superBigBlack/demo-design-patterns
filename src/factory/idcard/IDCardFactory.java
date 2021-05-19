package factory.idcard;

import factory.framework.Factory;
import factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 *          身份卡的生产类；“工厂”可以生产身份卡并注册进工厂
 *
 * @Author SuperDaHei
 * @Date 2021-05-19 21:24
 */
public class IDCardFactory extends Factory {

    private List<IDCard> allIDCards = new ArrayList<>();

    @Override
    public Product createProduct(String name) {
        return new IDCard(name);
    }

    @Override
    public void registerProduct(Product product) {
        allIDCards.add((IDCard) product);
    }
}
