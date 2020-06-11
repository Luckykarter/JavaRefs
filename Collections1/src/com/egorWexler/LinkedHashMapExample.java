package com.egorWexler;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    // retains the order of elements

    static LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<>(4,
            0.75f, true);
    // when accessOrder is True - the first element is the last one
    // that was accessed/
    // when false - it is in order elements were added

    public static void main() {
        phonebook.put("Kevin", 1234);
        phonebook.put("Me", 1);
        phonebook.put("Brenda", 4343);

        System.out.println(phonebook);

        for(Map.Entry<String, Integer> entry: phonebook.entrySet()){
            System.out.println("Key: " + entry.getKey() + "\nvalue: " + entry.getValue());
        }
    }

}
