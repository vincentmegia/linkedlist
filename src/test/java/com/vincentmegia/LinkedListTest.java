package com.vincentmegia;

import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void addNumbers() {
        var parent = new LinkedList(3);
        parent.add(5);
        parent.add(10);
        var size = parent.size();
        parent.print();
        var text = parent.toString();
        assertEquals(3, size);
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
        var text = parent.toString();
        text = text.substring(0, text.length() - 1);
        assertEquals("1,3,5", text);
    }
}
