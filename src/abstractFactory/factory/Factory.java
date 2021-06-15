package abstractFactory.factory;

import abstractFactory.t.TFactory;

/**
 * TODO
 * @author SuperDaHei
 * @date 2021-06-15 22:25
 */
public abstract class Factory {
    public static Factory getFactory(Integer num) {
        if (num == null)
            throw new NullPointerException();
        switch (num) {
            case 1 :
                return new TFactory();
        }
        throw new RuntimeException("不在序号内");
    }

    public abstract Start createStart();

    public abstract End createEnd();

    public abstract Out createOut();
}
