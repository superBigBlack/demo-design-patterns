package abstractFactory;

import abstractFactory.factory.Factory;

/**
 * TODO
 *
 * @author SuperDaHei
 * @date 2021-06-15 22:48
 */
public class Main {

    public static void main(String[] args) {
        Factory tf = Factory.getFactory(1);
        tf.createOut().out(tf.createEnd().end(tf.createStart().start("AAA")));
    }
}
