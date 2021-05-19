package factory;

import factory.idcard.IDCard;
import factory.idcard.IDCardFactory;

/**
 * @Description TODO
 * @Author SuperDaHei
 * @Date 2021-05-19 21:30
 */
public class Main {
    public static void main(String[] args) {
        IDCardFactory idCardFactory = new IDCardFactory();
        IDCard a = (IDCard) idCardFactory.create("a");
        IDCard b = (IDCard) idCardFactory.create("b");
        IDCard c = (IDCard) idCardFactory.create("c");
        a.user();
        b.user();
        c.user();
    }
}
