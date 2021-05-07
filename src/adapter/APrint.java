package adapter;

/**
 * @Description
 *          1. 新开发的需求只能使用当前{@link APrint}接口方法；老旧类{@link Banner}需要适配后才可以被使用
 *
 * @Author SuperDaHei
 * @Date 2021-05-07 21:09
 */
public interface APrint {

    void printUp();

    void printLow();
}
