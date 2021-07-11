package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据生成类抽象类，主要用于注册观察者，通知观察者
 *
 * @author SuperDaHei
 * @date 2021-07-11 22:29
 */
public abstract class NumberGenerator {

    private List<Observer> observers = new ArrayList<>();

    public void addObservers(Observer observer) {
        observers.add(observer);
    }

    public void delObservers(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (int i = 0; i < 50; i++) {
            execute();
            observers.stream().forEach(v -> {
                v.setStatus(this);
            });
        }
    }

    // 获取数字
    public abstract int getNumber();
    // 更新数字
    public abstract void execute();

}
