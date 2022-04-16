package com.practice.linklist;

public interface DoublyListOperations extends ListCommonActions {

    void insertAtBegin(ListNode node);

    void insertAtEnd(ListNode node);

    void removeMatched(ListNode node);

    DLLNode getTail();

    DLLNode getHead();

    DLLNode removeFromBegin();

    DLLNode removeFromEnd();

}
