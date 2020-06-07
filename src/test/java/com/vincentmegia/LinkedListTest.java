package com.vincentmegia;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void addNumbers() {
        var parent = new LinkedList(3);
        parent.add(5);
        parent.add(10);
//        var tail1 = parent.getTail();
//        tail1.add(10);
        parent.printAll();
    }

    @Test
    public void sizeTest() {
        var parent = new LinkedList(3);
        parent.add(5);
        parent.add(10);
        assertEquals(parent.size(), 3);
    }

    @Test
    public void bubbleSortTest() {
        var parent = new LinkedList(5);
        parent.add(3);
        parent.add(1);
        var bubbleSorter = new LinkedListSorter(parent);
        bubbleSorter.bubbleSort();
        assertEquals("1,3,5", parent.toString());
    }
}
