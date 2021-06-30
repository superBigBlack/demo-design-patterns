package visitor;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-30 23:03
 */
public class ListVisitor extends Visitor{

    private String currentdir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file.getName());
    }

    @Override
    public void visit(Directory directory) {
        currentdir += "/" + directory.getName();
        for (Entry entry : directory.getAll()) {
            entry.accept(this);
        }
    }
}
