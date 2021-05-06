package iterator;

import java.util.ArrayList;

/**
 * @Description
 *          包含很多 {@link Fish} 对象
 *
 * @Author SuperDaHei
 * @Date 2021-05-06 22:23
 */
public class FishPond implements Aggregate{

    private ArrayList<Fish> fishs;

    public FishPond() {
        this.fishs = new ArrayList<>();
    }

    public void append(Fish fish) {
        fishs.add(fish);
    }

    @Override
    public Iterator iterator() {
        return new FishPondIterator(this);
    }

    public ArrayList<Fish> getFishs() {
        return fishs;
    }
}
