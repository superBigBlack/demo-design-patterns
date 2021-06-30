package visitor;


/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-30 23:09
 */
public class Main {
    public static void main(String[] args) {
        Directory d = new Directory("a");
        Directory d2 = new Directory("b");
        Directory d3 = new Directory("c");
        d2.add(d3);
        d2.add(new File(10, "3"));
        d.add(new File(10, "1"));
        d.add(new File(50, "2"));
        d.add(d2);
        d.accept(new ListVisitor());

    }
}
