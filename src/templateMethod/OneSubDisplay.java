package templateMethod;

/**
 * @Description
 *      仅仅实现抽象方法
 *
 * @Author SuperDaHei
 * @Date 2021-05-09 16:10
 */
public class OneSubDisplay extends AbstractDisplay{
    @Override
    void start() {
        System.out.println(" === start === ");
    }

    @Override
    void end() {
        System.out.println(" === end === ");
    }

    @Override
    void print() {
        System.out.println(" === print === ");
    }
}
