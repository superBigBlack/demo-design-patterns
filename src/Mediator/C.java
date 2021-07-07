package Mediator;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-07-07 21:54
 */
public class C implements Colleague{

    private Mediator mediator;

    public C(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setStatus(boolean status) {
        mediator.setStatus(status);
    }

    @Override
    public boolean getStatus() {
        return mediator.getStatus();
    }
}
