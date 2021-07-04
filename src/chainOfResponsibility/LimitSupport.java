package chainOfResponsibility;

/**
 * 指定小于多少处理
 *
 * @author SuperDaHei
 * @date 2021-07-04 20:54
 */
public class LimitSupport extends Support{

    private int number;


    public LimitSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    public boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < number) {
            return true;
        }
        return false;
    }
}
