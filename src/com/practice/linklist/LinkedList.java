package com.practice.linklist;


public class LinkedList implements ListOperations {

    ListNode head;
    private int length = 0;

    public LinkedList() {
        this.length = 0;
    }

    @Override
    public synchronized ListNode getHead() {
        return head;
    }

    @Override
    public synchronized void insertAtBegin(ListNode node) {
        node.setNext(head);
        head = node;
        length++;
    }

    @Override
    public synchronized void insertAtEnd(ListNode node) {
        if (head == null) {
            head = node;
        } else {
            ListNode p, q;
            for (p = head; (q = p.getNext()) != null; p = q) ;
            q.setNext(node);
        }
        length++;
    }

    @Override
    public void insert(int data, int position) {
        if (position < 0)
            position = 0;

        if (position > length)
            position = length;

        if (head == null) {
            head = new ListNode(data);
        } else if (position == 0) {
            ListNode temp = new ListNode(data);
            temp.setNext(head);
            head = temp;
        } else {
            ListNode temp = head;
            for (int i = 1; i < position; i++) {
                temp = temp.getNext();
            }
            ListNode newNode = new ListNode(data);
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);

        }
        length++;
    }

    @Override
    public synchronized ListNode removeFromBegin() {
        ListNode node = head;
        if (node != null) {
            head = node.getNext();
            node.setNext(null);
        }
        return node;
    }

    @Override
    public synchronized ListNode removeFromEnd() {
        if (head == null)
            return null;

        ListNode p = head, q = null, next = head.getNext();
        if (next == null) {
            head = null;
            return p;
        }
        while ((next = p.getNext()) != null) {
            q = p;
            p = next;
        }
        q.setNext(null);
        return p;
    }

    @Override
    public synchronized void removeMatched(ListNode node) {
        if (head == null)
            return;
        if (node.equals(head)) {
            head = head.getNext();
            return;
        }
        ListNode p = head, q = null;
        while ((q = p.getNext()) != null) {
            if (q.equals(node)) {
                p.setNext(q.getNext());
                return;
            }
            p = q;
        }
    }

    @Override
    public void remove(int position) {
        if (position < 0)
            position = 0;
        if (position > length)
            position = length;

        if (head == null) {
            return;
        }
        if (position == 0) {
            head = head.getNext();
        } else {
            ListNode tempNode = head;
            for (int i = 1; i < position; i++) {
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(tempNode.getNext().getNext());
        }
        length--;
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public int getPosition(int data) {
        int pos = 0;
        ListNode temp = head;
        while (temp != null) {
            if (head.getData() == data) {
                return pos;
            }
            pos++;
            temp = temp.getNext();
        }

        return Integer.MIN_VALUE;
    }

    @Override
    public void clearList() {
        head = null;
        length = 0;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        if (head == null)
            return result.append("]").toString();

        result.append(head.getData());
        ListNode temp = head.getNext();
        while (temp != null) {
            result.append(",").append(temp.getData());
            temp = temp.getNext();
        }
        return result.append("]").toString();
    }
}
