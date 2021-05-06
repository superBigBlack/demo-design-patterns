package iterator;

/**
 * @Description
 *         迭代器接口
 *
 * @Author SuperDaHei
 * @Date 2021-05-06 22:11
 */
public interface Iterator<T> {

    /**
     * 检查是否可以获取当前元素
     */
    boolean hasNext();

    /**
     * 获取当前元素
     */
    T next();
}
