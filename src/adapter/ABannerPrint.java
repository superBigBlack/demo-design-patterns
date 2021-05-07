package adapter;

/**
 * @Description
 *          {@link Banner}的继承式适配器的适配器类
 *
 * @Author SuperDaHei
 * @Date 2021-05-07 21:18
 */
public class ABannerPrint extends Banner implements APrint{

    public ABannerPrint(String source) {
        super(source);
    }

    @Override
    public void printUp() {
        printWeak();
    }

    @Override
    public void printLow() {
        printStrong();
    }
}
