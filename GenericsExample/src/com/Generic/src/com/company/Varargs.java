package com.company;

public class Varargs {
    public static void printStrings (String... items) {
        System.out.println("Strings:");
        for(int i= 0; i< items.length; ++i) {
            System.out.println(i + ". " + items[i]);
        }
    }
}
