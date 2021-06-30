package visitor;

/**
 * 表示文件
 *
 * @author SuperDaHei
 * @date 2021-06-24 21:22
 */
public class File implements Entry {

    private int size;

    private String name;

    public File(int size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "f";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
