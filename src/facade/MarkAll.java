package facade;

/**
 * 对外暴露的高层接口，此方法调用复杂关系的类方法；对外只是简单的接口，具体规则由方法编写者实现
 *
 * @author SuperDaHei
 * @date 2021-07-07 21:02
 */
public class MarkAll {

    public void mark(String head, String body) {
        Body body1 = new Body(new Head("head" + head + "head"));
        body1.printAll("body" + body + "body");
    }
}
