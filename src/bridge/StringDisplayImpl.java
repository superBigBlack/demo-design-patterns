package bridge;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-23 22:59
 */
public class StringDisplayImpl implements DisplayImpl{

    private String str;

    private int strSize;

    public StringDisplayImpl(String str) {
        this.str = str;
        this.strSize = str.length();
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("+" + str + "+");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < strSize; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
