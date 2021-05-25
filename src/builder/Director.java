package builder;

/**
 * @Description TODO
 * @Author SuperDaHei
 * @Date 2021-05-25 21:42
 */
public class Director {

    private BaseBuilder builder;

    public Director(BaseBuilder builder) {
        this.builder = builder;
    }

    public void printStr() {
        System.out.println(builder.getStart() + " 123456");
    }
}
