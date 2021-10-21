package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    private Node<E> first;

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;
    }

    /**
     * @return boolean
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Add a node at the beginning
     *
     * @param
     */
    public void addFirst(E elem) {
        Node<E> newNode = new Node<E>();
        newNode.elem = elem;
        if (isEmpty()) {
            first = newNode;
        } else {
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        }
    }

    /**
     * Add a node at the end
     *
     * @param elem
     */
    public void addLast(E elem) {
        Node<E> newNode = new Node<E>();
        newNode.elem = elem;
        if (isEmpty()) {
            first = newNode;
        } else {
            Node<E> last = first;
            while (first.next != null) {
                last = last.next;
            }
            newNode.prev = last;
            last.next = newNode;
        }
    }

    /**
     * Remove the first element of the DLL
     *
     * @return Node (the deelted node)
     */
    public E removeFirst() {
        if (!isEmpty()){
            E toDelete = first.elem;
            first = first.next;
            if(first != null){
                first.prev = null;
            }
            return toDelete;
        }
        throw new RuntimeException("List is empty");
    }

    /**
     * remove the last element of the DLL
     *
     * @return Node (the deleted one)
     */
    public E removeLast() {
        Node<E> last = first;
        while (last.next != null) {
            last = last.next;
        }
        if (!isEmpty()){
            E toDelete = last.elem;
            last = last.prev;
            if(last != null){
                last.next = null;
            }
            else{
                first = null;
            }
            return toDelete;
        }
        throw new RuntimeException("List is empty");
    }


    /**
     * @return the list as a String
     */
    @Override
    public String toString() {
        Node<E> temp = first;
        String tostring = "DLL{ ";

        while (temp != null) {
            tostring += temp.elem.toString() + " ";
            temp = temp.next;
        }
        tostring += "}";

        return tostring;
    }

    public E getFirstElement() {
        if(first != null) {
            return first.elem;
        }
        throw new RuntimeException("List is empty");
    }

    public E getLastElement() {
        if (first != null) {
            while (first.next != null) {
                first = first.next;
            }
            return first.elem;
        }
        throw new RuntimeException("List is empty");
    }

    public int getNumofElems(){
        int count = 0;
        while (first != null){
            first = first.next;
            count++;
        }
        return count;
    }
}
