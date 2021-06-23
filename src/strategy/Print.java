package strategy;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-23 23:24
 */
public class Print {

    private String str;

    private PrintStr printStr;

    public Print(String str, PrintStr printStr) {
        this.str = str;
        this.printStr = printStr;
    }

    public void start() {
        printStr.print(str);
    }
}
