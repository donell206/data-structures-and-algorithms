package rogeriogentil.data.structures.cap6;

import rogeriogentil.data.structures.cap3.SinglyLinkedList;

/**
 *
 * @author Rogerio J. Gentil
 */
public class LinkedStack<E> implements Stack<E> {

    private SinglyLinkedList<E> list = new SinglyLinkedList<>();
    
    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E pop() {
        return list.removeFist();
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public int size() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
}
