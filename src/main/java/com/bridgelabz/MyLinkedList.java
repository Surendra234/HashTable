package com.bridgelabz;

public class MyLinkedList<K> {

    public INode<K> head;
    public INode tail;

    public void MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Append Method
    public void append(INode node) {

        if(this.tail == null)
            this.tail = node;

        if(this.head == null) {
            this.head = node;
        } else {
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    // Search Method
    public INode<K> search(K key) {

        INode<K> node = head;
        while (node != null && node.getNext() != null) {
            if(node.getKey().equals(key)) {
                return node;
            }
            node = node.getNext();
        }
        return null;
    }

    // Delete Method
    public INode delete(K key) {

        INode<K> currentNode = head;
        INode<K> previousNode = null;

        while (currentNode != null && currentNode.getNext() != null) {
            previousNode = currentNode;
            if(currentNode.getKey().equals(key)) {
                previousNode.setNext(currentNode.getNext());
            }
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}