package decorator;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-27 23:23
 */
public abstract class Border extends Display{

    public Display display;

    public Border(Display display) {
        this.display = display;
    }
}
