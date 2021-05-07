package adapter;

/**
 * @Description
 *          {@link Banner}的委托式适配器的适配器类
 *
 * @Author SuperDaHei
 * @Date 2021-05-07 21:32
 */
public class BBannerPrint extends BPrint{

    private Banner banner;

    public BBannerPrint(String source) {
        this.banner = new Banner(source);
    }

    @Override
    void printUp() {
        this.banner.printWeak();
    }

    @Override
    void printLow() {
        this.banner.printStrong();
    }
}
