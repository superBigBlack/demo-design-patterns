package decorator;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-27 23:21
 */
public class StringDisplay extends Display{

    private String str;

    public StringDisplay(String str) {
        this.str = str;
    }

    @Override
    public int getColumns() {
        return str.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return str;
        }else {
            return null;
        }
    }
}
