package com.practice.linklist;

public interface ListCommonActions {

    void insert(int data, int position);

    void remove(int position);

    int length();

    int getPosition(int data);

    void clearList();

}
