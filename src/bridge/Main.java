package bridge;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-23 23:05
 */
public class Main {

    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("123"));
        Display d2 = new Display(new StringDisplayImpl("456"));
        CountDisplay cd = new CountDisplay(new StringDisplayImpl("789"));
        d1.display();
        d2.display();
        cd.display();
        cd.multiDisplay(10);
    }

}
