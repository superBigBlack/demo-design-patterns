package adapter;

/**
 * @Description
 *          继承式适配器模式实现
 *
 * @Author SuperDaHei
 * @Date 2021-05-07 21:20
 */
public class AMain {

    public static void main(String[] args) {
        APrint print = new ABannerPrint("12346");
        print.printUp();
        print.printLow();
    }
}
