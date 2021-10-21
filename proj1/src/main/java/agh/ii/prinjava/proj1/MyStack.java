package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

public interface MyStack<E> {
    /** To implement a stack */

    E pop();
    /** To remove the top element of the stack */

    void push(E x);
    /** To add an element on the top of the stack  */

    default boolean isEmpty() {
        /** Boolean to return if the stack is empty */

        return numOfElems() == 0;
    }

    int numOfElems();

    E peek();
    /** Returns the value at the top of the stack */

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
