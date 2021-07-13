package state;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-07-13 21:44
 */
public class Main {
    public static void main(String[] args) {
        Context context = new ContextImpl();
        for (int i = 0; i < 20; i++) {
            context.setContext(i);
            context.use();
        }

    }
}
