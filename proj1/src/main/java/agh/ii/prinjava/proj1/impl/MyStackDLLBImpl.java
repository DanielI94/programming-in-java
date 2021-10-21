package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

/**
 * All the following is a reuse of methods from the DLL adapted to the Stack structure
 */
public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems = new DLinkList<>();

    /**
     * removeLast
     */
    @Override
    public E pop() {
        return elems.removeFirst();
    }

    /**
     * addLast
     */
    @Override
    public void push(E x) {
        elems.addFirst(x);
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
        return elems.getFirstElement();
    }

    /**
     * toString
     */
    @Override
    public String toString(){
        return elems.toString();
    }
}
