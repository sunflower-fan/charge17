package list;

/**
 * Created by Fan on 2017/2/20.
 */
public interface FanList<E> {
    boolean add(E e);
    void add(int index, E e);
    E get(int index);
    E remove(int index);
    int size();
    boolean isEmpty();
    boolean clear();
}
