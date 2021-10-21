package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems = new DLinkList<>();

    @Override
    public E pop() {
        return elems.removeFirst();
    }

    @Override
    public void push(E x) {
        elems.addFirst(x);
    }

    @Override
    public int numOfElems() {
        return elems.getNumofElems();
    }

    @Override
    public E peek() {
        return elems.getFirstElement();
    }

    @Override
    public String toString(){
        return elems.toString();
    }

}
