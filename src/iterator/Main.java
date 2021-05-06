package iterator;

/**
 * @Description TODO
 * @Author SuperDaHei
 * @Date 2021-05-06 22:36
 */
public class Main {

    public static void main(String[] args) {
        FishPond fishPond = new FishPond();
        fishPond.append(new Fish("A"));
        fishPond.append(new Fish("B"));
        fishPond.append(new Fish("C"));
        fishPond.append(new Fish("D"));
        fishPond.append(new Fish("E"));
        Iterator<Fish> fishIterator = new FishPondIterator(fishPond);
        while (fishIterator.hasNext()) {
            System.out.println(fishIterator.next().getName());
        }
    }
}
