package facade;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-07-07 20:59
 */
public class Body {

    private Head head;

    public Body(Head head) {
        this.head = head;
    }

    public void printAll(String body) {
        System.out.println(head.getHeadStr());
        System.out.println(body);
    }
}
