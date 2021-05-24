package prototype.framework;

import java.util.HashMap;

/**
 * @Description TODO
 * @Author SuperDaHei
 * @Date 2021-05-24 22:30
 */
public class Manager {
    private HashMap<String, Product> allP;

    public Manager() {
        this.allP = new HashMap<>();
    }

    public Manager(int size) {
        this.allP = new HashMap<>(size);
    }

    public void register(String p, Product product) {
        allP.put(p, product);
    }

    public Product create(String p) {
        Product product = allP.get(p);
        if (product == null) {
            return null;
        }
        return product.createClone();
    }

}
