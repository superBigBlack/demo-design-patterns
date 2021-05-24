package singleton;

/**
 * @Description TODO
 * @Author SuperDaHei
 * @Date 2021-05-19 21:51
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }


    public static Singleton createSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
