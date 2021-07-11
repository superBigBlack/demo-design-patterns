package observer;

/**
 * 观察者观察到数据后的操作
 *
 * @author SuperDaHei
 * @date 2021-07-11 22:40
 */
public class DigitObservers implements Observer{

    @Override
    public void setStatus(NumberGenerator numberGenerator) {
        System.out.println("DigitObservers number is " + numberGenerator.getNumber());
    }
}
