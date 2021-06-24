package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 表示目录
 *
 * @author SuperDaHei
 * @date 2021-06-24 21:22
 */
public class Directory implements Entry{

    private int size = 0;

    private String name;

    public Directory(String name) {
        this.name = name;
    }

    /**
     * 当前目录内的所有文件以及文件夹
     */
    private List<Entry> entries = new ArrayList<>();

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "d";
    }

    /**
     *  ADD() 方法在当前类中，导致 List<Entry> entries = new ArrayList<>(); 后续获取的目录类都需要转换才可以执行 add()方法，可以放置在 {@link Entry}
     * @param entry
     */
    public synchronized void add(Entry entry) {
        if (entry == null) {
            return;
        }
        this.size += entry.getSize();
        this.entries.add(entry);
    }

    public void printAll() {
        entries.forEach(v -> {
            System.out.println(v.getType() + " : " + v.getName() + " : " + v.getSize());
        });
    }
}
