package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

/** To implement a stack */
public interface MyStack<E> {

    /** To remove the top element of the stack */
    E pop();

    /** To add an element on the top of the stack  */
    void push(E x);

    /** Boolean to return if the stack is empty */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * @return the number of elements in our DLL
     */
    int numOfElems();

    /** Returns the value at the top of the stack */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
