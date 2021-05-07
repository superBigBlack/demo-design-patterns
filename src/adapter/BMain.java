package adapter;

/**
 * @Description
 *      委托式适配器模式
 *
 * @Author SuperDaHei
 * @Date 2021-05-07 21:34
 */
public class BMain {

    public static void main(String[] args) {
        BPrint print = new BBannerPrint("123456");
        print.printUp();
        print.printLow();
    }
}
