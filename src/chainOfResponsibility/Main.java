package chainOfResponsibility;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-07-04 20:59
 */
public class Main {

    public static void main(String[] args) {
        Support s1 = new NoSupport("No");
        Support s2 = new LimitSupport("Limit 1", 50);
        Support s3 = new LimitSupport("Limit 2", 100);
        Support s4 = new PercentSupport("Percent 1", 2);
        Support s5 = new PercentSupport("Percent 2", 5);
        s1.getNext(s2).getNext(s3).getNext(s4).getNext(s5);

        for (int i = 0; i < 10000; i++) {
            s1.support(new Trouble(i));
        }

    }
}
