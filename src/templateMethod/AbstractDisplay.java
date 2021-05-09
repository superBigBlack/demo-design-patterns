package templateMethod;

/**
 * @Description
 *      模板模式父类
 *
 *          1. 执行start()方法
 *          2. 循环十次print()方法
 *          3. 执行ent()方法
 *
 * @Author SuperDaHei
 * @Date 2021-05-09 16:02
 */
public abstract class AbstractDisplay {

    abstract void start();

    abstract void end();

    abstract void print();

    public void display(){
        start();
        for (int i = 0; i < 10; i++) {
            print();
        }
        end();
    }
}
