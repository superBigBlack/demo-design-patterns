package abstractFactory.t;

import abstractFactory.factory.End;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-15 22:42
 */
public class TEnd extends End {
    @Override
    public String end(String str) {
        return str + " ###";
    }
}
