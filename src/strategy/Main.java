package strategy;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-23 23:26
 */
public class Main {

    public static void main(String[] args) {
        String str = "123456abc";
        Print p1 = new Print(str, new PrintStrOne());
        Print p2 = new Print(str, new PrintStrTwo());
        p1.start();
        p2.start();
    }
}
