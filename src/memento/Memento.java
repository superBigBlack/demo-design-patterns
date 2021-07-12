package memento;

import java.time.LocalDateTime;
import java.util.*;

/**
 * 备忘录类
 *          继承当前备忘录类可以实现，记录实例，撤销上次保存的实例
 *
 * @author SuperDaHei
 * @date 2021-07-12 22:12
 */
public class Memento<T> {

    // 实例记录
    private TreeMap<LocalDateTime, T> mementos = new TreeMap<>(Collections.reverseOrder());

    public void saveMemento(T t) {
        mementos.put(LocalDateTime.now(), t);
    }

    private T getLastMemento() {
        if (mementos.size() == 0) {
            return null;
        }
        return mementos.firstEntry().getValue();
    }

    public void printAllLog(){
        mementos.entrySet().forEach(v -> {
            System.out.println(v.getKey().toString() + " : " + v.getValue());
        });
    }

    public void restoreMemento(T t) {
        t = getLastMemento();
        if (t != null) {
            mementos.remove(mementos.firstKey());
        }
    }
}
