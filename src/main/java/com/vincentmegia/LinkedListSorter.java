package com.vincentmegia;

public class LinkedListSorter {
    private LinkedList linkedList;

    public LinkedListSorter(LinkedList linkedList) {
        this.linkedList = linkedList;
    }

    public void bubbleSort() {
        var main = this.linkedList;
        while(main != null) {
            var index = main.getNext();
            while(index != null) {
                if (main.getValue() > index.getValue()) {
                    var tempValue = index.getValue();
                    index.setValue(main.getValue());
                    main.setValue(tempValue);;
                }
                index = index.getNext();
            }
            main = main.getNext();
        }
    }
}
