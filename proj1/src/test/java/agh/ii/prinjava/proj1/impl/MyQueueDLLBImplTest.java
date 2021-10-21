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

    @Test
    void enqueue(){
        queueOfInts.enqueue(4);
        queueOfInts.enqueue(5);
        assertEquals("DLL{ 5 4 }", queueOfInts.toString());
    }

    @Test
    void dequeue(){
        queueOfInts.enqueue(4);
        queueOfInts.enqueue(5);
        queueOfInts.dequeue();
        queueOfInts.dequeue();
        assertEquals("DLL{ }", queueOfInts.toString());
    }

    @Test
    void peek(){
        enqueue();
        assertEquals(4, queueOfInts.peek());
    }

    @Test
    void toStringtest(){
        enqueue();
        assertEquals("DLL{ 5 4 }", queueOfInts.toString());
    }
}