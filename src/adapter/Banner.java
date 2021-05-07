package adapter;

/**
 * @Description
 *          新编写的类，没有实现{@link APrint}接口的方法；无法直接使用
 *
 * @Author SuperDaHei
 * @Date 2021-05-07 21:12
 */
public class Banner {

    private String source;

    public Banner(String source) {
        this.source = source;
    }

    public void printWeak() {
        System.out.println("(" + this.source + ")");
    }

    public void printStrong() {
        System.out.println("*" + this.source + "*");
    }
}
