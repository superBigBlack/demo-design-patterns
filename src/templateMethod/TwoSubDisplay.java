package templateMethod;

/**
 * @Description
 *          不仅实现抽象方法，还重写父类处理流程方法
 *
 * @Author SuperDaHei
 * @Date 2021-05-09 16:11
 */
public class TwoSubDisplay extends AbstractDisplay{

    /**
     * 边框显示的字符
     */
    private String ch = "*";

    /**
     * 边框的长度 打印字符串前后三个空格
     */
    private int length;

    /**
     * 打印的字符串
     */
    private String printStr;

    public TwoSubDisplay(String ch, String printStr) {
        this.ch = ch;
        this.printStr = printStr;
        this.length = printStr.length() + 8;
    }

    public TwoSubDisplay(String printStr) {
        this.printStr = printStr;
        this.length = printStr.length() + 8;
    }

    @Override
    void start() {
        for (int i = 0; i < length; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }

    @Override
    void end() {
        for (int i = 0; i < length; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }

    @Override
    void print() {
        System.out.print(ch);
        interval();
        System.out.print(printStr);
        interval();
        System.out.print(ch);
        System.out.println();
    }
    private void interval() {
        System.out.print("   ");
    }
}
