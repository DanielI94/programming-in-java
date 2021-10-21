package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * This method tests the addFirst method
     */
    @Test
    void addFirst(){
        dLinkList.addFirst(4);
        dLinkList.addFirst(5);
        assertEquals("DLL{ 5 4 }", dLinkList.toString());
    }

    /**
     * This method tests the addLast method
     */
    @Test
    void addLast(){
        dLinkList.addLast(4);
        dLinkList.addLast(5);
        assertEquals("DLL{ 4 5 }", dLinkList.toString());
    }

    /**
     * This method tests the removeFirst method
     */
    @Test
    void removeFirst(){
        dLinkList.addLast(4);
        dLinkList.addLast(5);
        dLinkList.removeFirst();
        dLinkList.removeFirst();
        assertEquals("DLL{ }", dLinkList.toString());
    }

    /**
     * This method tests the removeLast method
     */
    @Test
    void removeLast(){
        dLinkList.addLast(4);
        dLinkList.addLast(5);
        dLinkList.removeLast();
        dLinkList.removeLast();
        assertEquals("DLL{ }", dLinkList.toString());
    }

    /**
     * This method tests the getFirstElement method
     */
    @Test
    void getFirstElement(){
        addLast();
        assertEquals(4, dLinkList.getFirstElement());
    }

    /**
     * This method tests the getLastElement method
     */
    @Test
    void getLastElement(){
        addLast();
        assertEquals(5, dLinkList.getLastElement());
    }

    /**
     * This method tests the getNumofElems method
     */
    @Test
    void getNumofElems(){
        assertEquals(0, dLinkList.getNumofElems());
        addLast();
        assertEquals(2, dLinkList.getNumofElems());
    }

    /**
     * This method tests the toString method
     */
    @Test
    void toStringtest(){
        addLast();
        assertEquals("DLL{ 4 5 }", dLinkList.toString());
    }
}