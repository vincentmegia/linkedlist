package com.vincentmegia;

public class LinkedList {
    private int value;
    private int size;
    private LinkedList tail;

    public LinkedList(int value) {
        this.value = value;
    }

    public void print() {
        var currentNode = this;
        System.out.println(currentNode.getValue());
        if (currentNode.getNext() != null) {
            currentNode.getNext().print();
        }
    }
    public void add(int value) {
        var currentNode = this;
        if (currentNode.getNext() != null)
            currentNode.getNext().add(value);
        else
            currentNode.setTail(new LinkedList(value));
    }

    public int size() {
            var currentNode = this;
        var size = 1;
        if (currentNode.getNext() != null) {
            size += currentNode.getNext().size();
        }
        return size;
    }

    @Override
    public String toString() {
        var currentNode = this;
        var text = this.value + ",";
        if (currentNode.getNext() != null)
            text += currentNode.getNext().toString();
        return text;
    }

    //boiler plate
    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedList getNext() {
        return this.tail;
    }

    public void setTail(LinkedList tail) {
        this.tail = tail;
    }
}
