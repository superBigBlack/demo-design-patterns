package abstractFactory.t;

import abstractFactory.factory.Out;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-15 22:44
 */
public class TOut extends Out {
    @Override
    public void out(String str) {
        System.out.println("OUT: " + str);
    }
}
