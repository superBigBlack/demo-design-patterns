package builder;

/**
 * @Description TODO
 * @Author SuperDaHei
 * @Date 2021-05-25 21:46
 */
public class BBuilder implements BaseBuilder{

    private String b = "B str";

    @Override
    public String getStart() {
        return b;
    }
}
