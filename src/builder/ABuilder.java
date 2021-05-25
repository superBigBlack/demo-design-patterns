package builder;

/**
 * @Description TODO
 * @Author SuperDaHei
 * @Date 2021-05-25 21:44
 */
public class ABuilder implements BaseBuilder{

    private String a = "A str";

    @Override
    public String getStart() {
        return a;
    }
}
