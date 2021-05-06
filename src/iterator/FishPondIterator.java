package iterator;

/**
 * @Description
 *      {@link FishPond} 迭代器类
 *
 * @Author SuperDaHei
 * @Date 2021-05-06 22:25
 */
public class FishPondIterator implements Iterator<Fish>{

    private FishPond fishPond;

    /**
     * 当前所处索引位置
     */
    private int index = 0;

    public FishPondIterator(FishPond fishPond) {
        this.fishPond = fishPond;
    }

    @Override
    public boolean hasNext() {
        if (index < fishPond.getFishs().size()) {
            return true;
        }
        return false;
    }

    @Override
    public Fish next() {
        index ++;
        return fishPond.getFishs().get(index - 1);
    }
}
