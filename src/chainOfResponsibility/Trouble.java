package chainOfResponsibility;

/**
 * 表示需要被处理的类，带有问题标号
 *
 * @author SuperDaHei
 * @date 2021-07-04 20:40
 */
public class Trouble {

    private int number;

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[" + number + "]";
    }

    public Trouble(int number) {
        this.number = number;
    }
}
