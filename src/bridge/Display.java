package bridge;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-23 22:54
 */
public class Display {

    private DisplayImpl displayImpl;

    public Display(DisplayImpl displayImpl) {
        this.displayImpl = displayImpl;
    }

    public void open() {
        displayImpl.rawOpen();
    }

    public void print() {
        displayImpl.rawPrint();
    }

    public void close() {
        displayImpl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
