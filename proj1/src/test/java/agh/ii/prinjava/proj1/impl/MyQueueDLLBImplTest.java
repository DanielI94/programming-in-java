package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();
    

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * This method tests the enqueue method
     */
    @Test
    void enqueue(){
        queueOfInts.enqueue(4);
        queueOfInts.enqueue(5);
        assertEquals("DLL{ 5 4 }", queueOfInts.toString());
    }

    /**
     * This method tests the dequeue method
     */
    @Test
    void dequeue(){
        queueOfInts.enqueue(4);
        queueOfInts.enqueue(5);
        queueOfInts.dequeue();
        queueOfInts.dequeue();
        assertEquals("DLL{ }", queueOfInts.toString());
    }

    /**
     * This method tests the peek method
     */
    @Test
    void peek(){
        enqueue();
        assertEquals(4, queueOfInts.peek());
    }

    /**
     * This method tests the toStringtest method
     */
    @Test
    void toStringtest(){
        enqueue();
        assertEquals("DLL{ 5 4 }", queueOfInts.toString());
    }
}