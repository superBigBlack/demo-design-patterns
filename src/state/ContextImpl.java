package state;

/**
 * 具体的业务实现类
 *
 * @author SuperDaHei
 * @date 2021-07-13 21:42
 */
public class ContextImpl implements Context{

    private State state = StateA.getInstance();

    private int num;

    @Override
    public void setContext(int num) {
        this.num = num;
        state.setContext(this);
    }

    @Override
    public void changeState(State state) {
        this.state = state;
    }

    @Override
    public int getNumber() {
        return num;
    }

    @Override
    public void use() {
        state.printState(this);
    }

}
