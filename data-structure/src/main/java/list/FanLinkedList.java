package list;

/**
 * Created by fan on 2017/2/25.
 */
public class FanLinkedList<E> {

//    int size;
//    Node<E> head;
//    Node<E> last;
//
//    public void add(E e) {
//        if (isEmpty()) {
//            head = new Node(e, null);
//            last = head;
//        } else {
//            Node<E> newNode = (Node<E>) new Node(e, null);
//            last.next = newNode;
//            last = newNode;
//        }
//        size++;
//    }
//
//    public void add(int index, E e) {
//        rangeCheck(index);
//        Node<E> beforeNode = findNode(index - 1);
//        Node<E> afterNode = beforeNode.next;
//        Node<E> node = new Node(e, null);
//        beforeNode.next = node;
//        node.next = afterNode;
//        last = node;
//        size++;
//    }
//    public E get(int index) {
//        return findNode(index).e;
//    }
//
//    public E remove(int index) {
//        rangeCheck(index);
//        Node<E> beforeNode =  findNode(index - 1);
//        Node<E> targetNode = beforeNode.next;
//        beforeNode.next = null;
//        size--;
//        last = beforeNode;
//        return targetNode.e;
//    }
//
//    public int size() {
//        return size;
//    }
//
//    public void addFirst(E e) {
//        Node<E> node = new Node(e, null);
//        node.next = head;
//        head = node;
//        size++;
//    }
//
//    public E removeFirst() {
//        if (isEmpty()) {
//            throw new RuntimeException("linked list is empty");
//        }
//        Node<E> target = this.head;
//        head = target.next;
//        target.next = null;
//        size--;
//        return target.e;
//    }
//
//    public E removeLast() {
//        Node<E> targetBefore = find(size - 2);
//        Node<E> target = last;
//        targetBefore.next = null;
//        last = targetBefore;
//        size--;
//        return target.e;
//    }
//
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//    private static class Node<E> {
//        E e;
//        Node next;
//
//        public Node(E e, Node next) {
//            this.e = e;
//            this.next = next;
//        }
//    }
}
