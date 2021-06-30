package visitor;

/**
 * 处理动作抽象类
 *          打印当前目录及子文件或者文件的资源地址
 *
 * @author SuperDaHei
 * @date 2021-06-30 22:59
 */
public abstract class Visitor {

    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
