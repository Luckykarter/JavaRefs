package com.egorWexler;

import java.util.HashMap;
// dictionary
// does not allow duplicates

public class HashMapExample {

    public static void main() {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Kevin", 12345);
        phoneBook.put("Joe", 4343);
        phoneBook.put("Volodya", 908);

        System.out.println(phoneBook);

        System.out.println(phoneBook.get("Kevin"));
        System.out.println("contains:");

        if(phoneBook.containsKey("Joe")) {
            System.out.println("Joe is in the book");
            phoneBook.remove("Joe");
        }

        System.out.println(phoneBook);

        System.out.println(phoneBook.get("Joe"));

        phoneBook.clear(); // removes all


    }

}
