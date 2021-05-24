package prototype;

import prototype.framework.Manager;

/**
 * @Description TODO
 * @Author SuperDaHei
 * @Date 2021-05-24 22:37
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(4);
        PrintName p1 = new PrintName("one");
        PrintName p2 = new PrintName("two");
        manager.register("p1", p1);
        manager.register("p2", p2);

        manager.create("p1").createClone().printStr();
        manager.create("p2").createClone().printStr();

    }
}
