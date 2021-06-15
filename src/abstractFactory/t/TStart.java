package abstractFactory.t;

import abstractFactory.factory.Start;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-15 22:42
 */
public class TStart extends Start {
    @Override
    public String start(String str) {
        return "### " + str;
    }
}
