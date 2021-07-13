package state;

/**
 * 调用每种状态的业务类接口
 *
 * @author SuperDaHei
 * @date 2021-07-13 21:28
 */
public interface Context {

    void setContext(int num);

    void changeState(State state);

    int getNumber();

    void use();

}
