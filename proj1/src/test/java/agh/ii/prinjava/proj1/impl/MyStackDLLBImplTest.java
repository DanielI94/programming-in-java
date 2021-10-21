package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void push(){
        stackOfInts.push(4);
        stackOfInts.push(5);
        assertEquals("DLL{ 5 4 }", stackOfInts.toString());
    }

    @Test
    void pop(){
        stackOfInts.push(4);
        stackOfInts.push(5);
        stackOfInts.pop();
        stackOfInts.pop();
        assertEquals("DLL{ }", stackOfInts.toString());
    }

    @Test
    void peek(){
        push();
        assertEquals(5, stackOfInts.peek());
    }

    @Test
    void toStringtest(){
        push();
        assertEquals("DLL{ 5 4 }", stackOfInts.toString());
    }
}