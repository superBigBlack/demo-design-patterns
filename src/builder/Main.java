package builder;

/**
 * @Description TODO
 * @Author SuperDaHei
 * @Date 2021-05-25 21:47
 */
public class Main {
    public static void main(String[] args) {
        BaseBuilder a = new ABuilder();
        BaseBuilder b = new BBuilder();

        Director da = new Director(a);
        Director db = new Director(b);
        da.printStr();
        db.printStr();
        // 例如使用方法
        BaseBuilder base = null;
        if (args[0].equals("A")) {
            base= new ABuilder();
        }else if (args[0].equals("B")) {
            base = new BBuilder();
        }
        Director director = new Director(base);
        director.printStr();
    }
}
