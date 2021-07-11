package observer;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-07-11 22:51
 */
public class GraphObservers implements Observer{

    @Override
    public void setStatus(NumberGenerator numberGenerator) {
        for (int i = 0; i < numberGenerator.getNumber(); i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
