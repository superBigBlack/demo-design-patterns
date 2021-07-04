package chainOfResponsibility;

/**
 * 不处理类
 *
 * @author SuperDaHei
 * @date 2021-07-04 20:53
 */
public class NoSupport extends Support{
    public NoSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return false;
    }
}
