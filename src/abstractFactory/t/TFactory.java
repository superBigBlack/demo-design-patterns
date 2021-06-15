package abstractFactory.t;

import abstractFactory.factory.End;
import abstractFactory.factory.Factory;
import abstractFactory.factory.Out;
import abstractFactory.factory.Start;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-15 22:45
 */
public class TFactory extends Factory {

    @Override
    public Start createStart() {
        return new TStart();
    }

    @Override
    public End createEnd() {
        return new TEnd();
    }

    @Override
    public Out createOut() {
        return new TOut();
    }
}
