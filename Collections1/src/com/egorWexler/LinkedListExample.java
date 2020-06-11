package com.egorWexler;

import java.util.LinkedList;

public class LinkedListExample {
    // very quick for inserting and removing elements in the middle

    public static void main() {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("A");
        myList.add("B");
        myList.add(1, "C");
        System.out.println(myList);
        myList.remove("B");
        System.out.println(myList);

    }
}
