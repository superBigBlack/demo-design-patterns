package memento;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-07-12 22:38
 */
public class Main {
    public static void main(String[] args) {
        try {
        Memento<Generate> memento = new Memento<>();
        Generate generate = new Generate("0");
        memento.saveMemento(generate);
            Thread.sleep(1000);
        memento.saveMemento(new Generate("1"));
            Thread.sleep(1000);
        memento.printAllLog();
        System.out.println("------------------------------------");
        memento.saveMemento(new Generate("2"));
            Thread.sleep(1000);
        memento.printAllLog();
        System.out.println("撤回操作");
        memento.restoreMemento(generate);
        memento.saveMemento(new Generate("3"));
            Thread.sleep(1000);
        memento.printAllLog();
        System.out.println("------------------------------------");
        memento.saveMemento(new Generate("4"));
            Thread.sleep(1000);
        memento.printAllLog();
        System.out.println("------------------------------------");
        memento.saveMemento(new Generate("5"));
            Thread.sleep(1000);
        memento.printAllLog();
        System.out.println("------------------------------------");
        memento.saveMemento(new Generate("6"));
            Thread.sleep(1000);
        memento.printAllLog();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
