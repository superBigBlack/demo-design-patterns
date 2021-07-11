package observer;

import java.util.Random;

/**
 * 生成随机数类
 *      生成数据具体类，主要职责为数据的生成
 *
 * @author SuperDaHei
 * @date 2021-07-11 22:34
 */
public class RandomNumberGenerator extends NumberGenerator{

    private int num;

    @Override
    public int getNumber() {
        return num;
    }

    @Override
    public void execute() {
        num = new Random().nextInt(20);
    }
}
