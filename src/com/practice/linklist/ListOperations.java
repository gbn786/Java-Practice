package com.practice.linklist;

public interface ListOperations extends ListCommonActions {

    void insertAtBegin(ListNode node);

    void insertAtEnd(ListNode node);

    void removeMatched(ListNode node);

    ListNode getHead();

    ListNode removeFromBegin();

    ListNode removeFromEnd();


}
