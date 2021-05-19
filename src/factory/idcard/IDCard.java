package factory.idcard;

import factory.framework.Product;

/**
 * @Description
 *          生产的产品 身份卡
 *
 * @Author SuperDaHei
 * @Date 2021-05-19 21:21
 */
public class IDCard extends Product {

    private String userName;

    public IDCard(String userName) {
        System.out.println("注册了 IDCard");
        this.userName = userName;
    }

    @Override
    public void user() {
        System.out.println(userName + "使用了 IDCard");
    }

}
