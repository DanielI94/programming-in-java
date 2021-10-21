package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

/**
 * All the following is a reuse of methods from the DLL adapted to the Queue structure
 */
public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems = new DLinkList<>();

    /**
     * addFirst
     */
    @Override
    public void enqueue(E x) {
        elems.addFirst(x);
    }
    /**
     * removeFirst
     */
    @Override
    public E dequeue() {
        return elems.removeLast();
    }

    /**
     * numOfElems
     */
    @Override
    public int numOfElems() {
        return elems.getNumofElems();
    }

    /**
     * getFirstValue
     */
    @Override
    public E peek() {
        return elems.getLastElement();
    }

    /**
     * toString
     */
    @Override
    public String toString(){
        return elems.toString();
    }
}
