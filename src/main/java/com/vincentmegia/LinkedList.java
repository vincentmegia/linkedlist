package com.vincentmegia;

public class LinkedList {
    private int value;
    private int size;
    private LinkedList tail;

    public LinkedList(int value) {
        this.value = value;
    }

    public void printAll() {
        var currentNode = this;
        while(true) {
            System.out.println(currentNode.getValue());
            if (currentNode.getNext() == null) break;
            currentNode = currentNode.getNext();
        }
    }
    public void add(int value) {
        var currentNode = this;
        while(true){
            if (currentNode.getNext() == null) {
                currentNode.setTail(new LinkedList(value));
                break;
            }
            currentNode = currentNode.getNext();
        }
        currentNode.setTail(new LinkedList(value));
    }

    public int size() {
        var currentNode = this;
        while(currentNode != null) {
            size++;
            currentNode = currentNode.getNext();
        }
        return size;
    }

    @Override
    public String toString() {
        var currentNode = this;
        var text = "";
        while(true) {
            text += currentNode.getValue() + ",";
            if (currentNode.getNext() == null) break;
            currentNode = currentNode.getNext();
        }
        text = text.substring(0, text.length() - 1);
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
