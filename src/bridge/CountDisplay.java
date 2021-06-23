package bridge;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-23 23:03
 */
public class CountDisplay extends Display{

    public CountDisplay(DisplayImpl displayImpl) {
        super(displayImpl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
