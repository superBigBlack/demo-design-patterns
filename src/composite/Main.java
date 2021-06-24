package composite;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-24 21:30
 */
public class Main {

    public static void main(String[] args) {
        Directory d = new Directory("a");
        d.add(new File(10, "1"));
        d.add(new File(50, "2"));
        d.add(new Directory("b"));
        System.out.println(d.getName());
        System.out.println(d.getSize());
        d.printAll();
        File file = new File(100, "f1");
        System.out.println(file.getName());
        System.out.println(file.getSize());
    }
}
