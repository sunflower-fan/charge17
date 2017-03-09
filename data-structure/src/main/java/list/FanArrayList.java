package list;

import java.util.Arrays;

/**
 * Created by Fan on 2017/2/20.
 */
public class FanArrayList<E> implements FanList<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int capacity = DEFAULT_CAPACITY;
    private int size;

    public FanArrayList() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public FanArrayList(int initCapacity) {
        array = new Object[initCapacity];
        capacity = initCapacity;
    }

    public boolean add(E e) {
        if (isFull()) {
            extend();
        }
        array[size++] = e;
        return true;
    }

    public void add(int index, E e) {
        if (rangeCheck(index)) {
            throw new RuntimeException("index range out of bound");
        }
        if (isFull()) {
            extend();
        }
        for (int i = size; i >= index ; i--) {
            array[i] = array[i - 1];
            if (i == index)
                array[i] = e;
        }
        size++;
    }

    public E get(int index) {
        if (rangeCheck(index)) {
            throw new RuntimeException("index out of range");
        }
        return (E) array[index];
    }

    public E remove(int index) {
        if (rangeCheck(index)) {
            throw new RuntimeException("index out of range");
        }
        E e = (E) array[index];
        if (index == size - 1) {
            return e;
        }
        for (int i = index; i < size - 1; i++) {
            array[index] = array[index + 1];
        }
        array[size - 1] = null; // let gc do it work
        size--;
        return e;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null; // let gc do it work
        }
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
        return true;
    }

    private void extend() {
        array = Arrays.copyOf(array, capacity * 2);
        capacity *= capacity;
    }

    private boolean isFull() {
        return size == capacity;
    }

    private boolean rangeCheck(int index) {
        return index < 0 || index >= size;
    }

    public int getCapacity() {
        return capacity;
    }
}
