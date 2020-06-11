package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static <T> List arrayToList(T[] array, List<T> list){
        Collections.addAll(list, array);
        return list;
    }

    static Integer[] intArray = {1, 2, 3, 4};
    static Boolean[] boolArray = {true, false, true};
    public static void main(String[] args) {
        // can keep different types
        List names0 = new ArrayList();
        names0.add("Test");
        names0.add(8);

        System.out.println(names0.get(0));
        System.out.println(names0.get(1));

        // Keeps only given type
        List<String> names = new ArrayList();
        names.add("KElly");
        String name2 = names.get(0);
        System.out.println("name: " + name2);


        List<Integer> intList = arrayToList(intArray, new ArrayList<Integer>());

        String s1 = "Test";
        String s2 = "Apple";
        String s3 = "Google";

        Varargs.printStrings(s1);
        Varargs.printStrings(s1, s3, s2);

        // override .toString default method to print something
        Overrides.Building building = new Overrides.Building();
        System.out.println(building);

        Overrides.Office off = new Overrides.Office();
        System.out.println(off);





    }
}
