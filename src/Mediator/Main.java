package Mediator;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-07-07 21:54
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        A a = new A(mediator);
        B b = new B(mediator);
        C c = new C(mediator);
        System.out.println("============================== init ============================");
        System.out.println("A : " + a.getStatus());
        System.out.println("B : " + b.getStatus());
        System.out.println("C : " + c.getStatus());
        System.out.println("============================== A set true ============================");
        a.setStatus(true);
        System.out.println("A : " + a.getStatus());
        System.out.println("B : " + b.getStatus());
        System.out.println("C : " + c.getStatus());
        System.out.println("============================== B set false ============================");
        b.setStatus(false);
        System.out.println("A : " + a.getStatus());
        System.out.println("B : " + b.getStatus());
        System.out.println("C : " + c.getStatus());
    }
}
