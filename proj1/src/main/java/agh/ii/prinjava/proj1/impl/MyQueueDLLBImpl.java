package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems = new DLinkList<>();

    @Override
    public void enqueue(E x) {
        elems.addFirst(x);
    }

    @Override
    public E dequeue() {
        return elems.removeLast();
    }

    @Override
    public int numOfElems() {
        return elems.getNumofElems();
    }

    @Override
    public E peek() {
        return elems.getLastElement();
    }

    @Override
    public String toString(){
        return elems.toString();
    }
}
