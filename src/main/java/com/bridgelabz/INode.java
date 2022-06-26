package com.bridgelabz;

public interface INode<K> {

    // Method For Key
    K getKey();
    void setKey(K key);

    // Method For next
    INode<K> getNext();
    void setNext(INode<K> next);
}