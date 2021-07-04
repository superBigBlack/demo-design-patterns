package chainOfResponsibility;

/**
 * 指定倍数处理
 *
 * @author SuperDaHei
 * @date 2021-07-04 20:57
 */
public class PercentSupport extends Support{

    private int percent;

    public PercentSupport(String name, int percent) {
        super(name);
        this.percent = percent;
    }

    @Override
    public boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % percent == 0) {
            return true;

        }
        return false;
    }
}
