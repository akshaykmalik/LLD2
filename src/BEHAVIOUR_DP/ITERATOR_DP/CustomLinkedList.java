package BEHAVIOUR_DP.ITERATOR_DP;

import java.util.NoSuchElementException;

public class CustomLinkedList<T> implements Iterable<T> {
    Node head, tail;
    private class Node {
        Node next, prev;
        T val;
        Node(T val) {
            this.val = val;
        }
    }

    /**
     * here ListIterator<T> is not used becuse ListIterator inherits T from enclossing class
     * where will it fail ? -> if ListIterator is a standalone class without a generic outer class: 
     * class ListIterator implements Iterator<E> { }
     */
    class ListIterator implements Iterator<T> {
        Node currNode;
        ListIterator() {
            currNode = head;
        }

        @Override
        public boolean  hasNext() {
            return currNode != null;
        }

        public T next() {
            if(!hasNext()) {
                throw new NoSuchElementException();
            }
            Node temp = currNode;
            currNode = currNode.next;
            return temp.val;
        }
    }  

    void add(T val) {
        Node n = new Node(val);

        if(head == null)  {
            head = tail = n;
            return ;
        }

        tail.next = n;
        n.prev = tail;
        tail = tail.next;
    }

    void remove(T elem) {
        Node temp = head;

        while(temp != null) {
            if(temp == elem) {
                Node prev = temp.prev;
                Node next = temp.next;

                temp.next = temp.prev = null;

                if(prev != null) {
                    prev.next = next;
                }

                if(next != null) {
                    next.prev = prev;
                }

                if(temp == head) {
                    head = next;
                }

                if(temp == tail) {
                    tail = prev;
                } 

            }
            temp = temp.next;
        }
    }
    
    /*
     * here we didn't use new ListIterator<>() because <> diamond operator works for top level generic class and static class
     */
    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }
}
