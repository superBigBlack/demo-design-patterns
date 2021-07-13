package state;

/**
 * 每种状态需要做的事情
 *
 * @author SuperDaHei
 * @date 2021-07-13 21:27
 */
public interface State {

    void setContext(Context context);

    void printState(Context context);

}
