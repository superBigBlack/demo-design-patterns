package iterator;

/**
 * @Description
 *          携带迭代器集合的接口
 *             用于规定类获取迭代器对象
 *
 * @Author SuperDaHei
 * @Date 2021-05-06 22:16
 */
public interface Aggregate {

    /**
     * 获取迭代器对象
     */
    Iterator iterator();
}
