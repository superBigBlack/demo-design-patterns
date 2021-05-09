package templateMethod;

/**
 * @Description TODO
 * @Author SuperDaHei
 * @Date 2021-05-09 16:23
 */
public class Main {

    public static void main(String[] args) {
        AbstractDisplay one = new OneSubDisplay();
        AbstractDisplay two = new TwoSubDisplay("123456");
        one.display();
        two.display();
    }
}
