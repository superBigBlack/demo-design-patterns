package decorator;

/**
 * 显示的基本类
 *
 * @author SuperDaHei
 * @date 2021-06-27 23:16
 */
public abstract class Display {

    /**
     * 获取字符横数
     */
    public abstract int getColumns();

    /**
     * 获取字符列数
     */
    public abstract int getRows();

    /**
     * 返回指定行数字符串
     */
    public abstract String getRowText(int row);

    /**
     * 打印所有的字符串
     */
    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }

}
