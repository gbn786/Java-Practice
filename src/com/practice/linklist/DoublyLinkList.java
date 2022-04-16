package com.practice.linklist;

public class DoublyLinkList implements DoublyListOperations {

    private DLLNode head;
    private DLLNode tail;
    private int length;

    public DoublyLinkList(DLLNode head, DLLNode tail, int length) {
        this.head = head;
        this.tail = tail;
        this.length = length;
    }

    @Override
    public void insertAtBegin(ListNode node) {

    }

    @Override
    public void insertAtEnd(ListNode node) {

    }

    @Override
    public void removeMatched(ListNode node) {

    }

    @Override
    public DLLNode getHead() {
        return head;
    }

    @Override
    public DLLNode getTail() {
        return tail;
    }

    @Override
    public DLLNode removeFromBegin() {
        return null;
    }

    @Override
    public DLLNode removeFromEnd() {
        return null;
    }

    @Override
    public void insert(int data, int position) {

    }

    @Override
    public void remove(int position) {

    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public int getPosition(int data) {
        return 0;
    }

    @Override
    public void clearList() {
        head = null;
        tail = null;
        length = 0;
    }
}
