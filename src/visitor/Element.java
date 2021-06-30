package visitor;

/**
 * 接受数据接口类
 *
 * @author SuperDaHei
 * @date 2021-06-30 22:58
 */
public interface Element {

    void accept(Visitor visitor);
}
