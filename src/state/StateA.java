package state;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-07-13 21:33
 */
public class StateA implements State{

    private static final StateA stateA = new StateA();

    private StateA() {

    }

    public static StateA getInstance(){
        return stateA;
    }

    @Override
    public void setContext(Context context) {
        if (context.getNumber() % 2 == 0) {
            context.changeState(StateB.getInstance());
        }
    }

    @Override
    public void printState(Context context) {
        System.out.println("StateA :" + context.getNumber());
    }
}
