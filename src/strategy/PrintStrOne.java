package strategy;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-23 23:25
 */
public class PrintStrOne implements PrintStr{
    @Override
    public void print(String str) {
        System.out.println("+++ " + str);
    }
}
