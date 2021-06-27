package decorator;

import javafx.geometry.Side;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-27 23:35
 */
public class Main {

    public static void main(String[] args) {
        Display d1 = new StringDisplay("123456");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show();
        Display d4 = new SideBorder(
                new FullBorder(
                        new FullBorder(
                                new SideBorder(
                                        new FullBorder(
                                                new StringDisplay("Hello world")
                                        ), '*')
                        )
                ), '/');
        d4.show();
    }
}
