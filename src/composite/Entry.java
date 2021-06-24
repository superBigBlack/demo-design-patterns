package composite;

/**
 * 表示文件与目录的顶级接口
 *
 * @author SuperDaHei
 * @date 2021-06-24 21:21
 */
public interface Entry {

    int getSize();

    String getName();

    String getType();
}
