package observer;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-07-11 22:52
 */
public class Main {
    public static void main(String[] args) {
        NumberGenerator n1 = new RandomNumberGenerator();
        DigitObservers o1 = new DigitObservers();
        GraphObservers o2 = new GraphObservers();
        n1.addObservers(o1);
        n1.addObservers(o2);
        n1.notifyObservers();
    }
}
