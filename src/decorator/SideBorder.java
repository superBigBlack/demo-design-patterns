package decorator;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-27 23:24
 */
public class SideBorder extends Border{

    private char borderChar;

    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
            return borderChar + display.getRowText(row) + borderChar;
    }

}
