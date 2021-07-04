package chainOfResponsibility;

/**
 * 问题处理定级抽象父类
 *
 * @author SuperDaHei
 * @date 2021-07-04 20:41
 */
public abstract class Support {

    private String name;

    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support getNext(Support support) {
        this.next = support;
        return next;
    }

    public void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        }else if (next != null) {
            next.support(trouble);
        }else {
            fail(trouble);
        }
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }

    void done(Trouble trouble) {
        System.out.println(trouble + "被" + this + "解决的");
    }

    void fail(Trouble trouble) {
        System.out.println(trouble + "未被解决的");
    }

    public abstract boolean resolve(Trouble trouble);


}
