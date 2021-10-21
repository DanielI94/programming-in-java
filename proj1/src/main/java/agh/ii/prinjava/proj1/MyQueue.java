package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

public interface MyQueue<E> {
    /** This interface creates a queue structure */

    void enqueue(E x);
    /** To add elements to a queue */

    E dequeue();
    /** To remove elements from a queue */

    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    int numOfElems();

    E peek();
    /** To return the first value (most recently added) in the queue */

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}

