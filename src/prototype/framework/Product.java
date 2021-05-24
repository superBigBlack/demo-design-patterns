package prototype.framework;

/**
 * @Description TODO
 * @Author SuperDaHei
 * @Date 2021-05-24 22:28
 */
public abstract class Product implements Cloneable {

    public abstract void printStr();

    public abstract Product createClone();
}
