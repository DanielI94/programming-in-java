package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;


    /** This interface creates a queue structure */
    public interface MyQueue<E> {

    /** To add elements to a queue */
    void enqueue(E x);

    /** To remove elements from a queue */
    E dequeue();


        /**
         *
         * @return boolean if the DLL is empty
         */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

        /**
         *
         * @return the number of elements in our DLL
         */
    int numOfElems();

        /** To return the first value (most recently added) in the queue */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}

