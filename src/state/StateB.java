package state;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-07-13 21:34
 */
public class StateB implements State{

    private static final StateB stateB = new StateB();

    private StateB() {
    }

    public static StateB getInstance() {
        return stateB;
    }

    @Override
    public void setContext(Context context) {
        if (context.getNumber() % 2 != 0) {
            context.changeState(StateA.getInstance());
        }
    }

    @Override
    public void printState(Context context) {
        System.out.println("StateB :" + context.getNumber());
    }
}
