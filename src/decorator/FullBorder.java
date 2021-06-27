package decorator;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-27 23:28
 */
public class FullBorder extends Border{

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == display.getRows() + 1 ) {
            return "+" + markLine(display.getColumns(), '-') + "+";
        }else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    private String markLine(int count, char ch) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}
