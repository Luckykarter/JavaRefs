package com.ewx;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * filter and print elements using stream
 */
public class Main {


    public static void main(String[] args) {
        ArrayList<Book> books = populateLibrary();

        //stream of items might be filtered
        books.stream().filter(book -> {
            return book.getAuthor().startsWith("J");
        }).filter(book -> {
            return book.getTitle().startsWith("E");
        }).forEach(System.out::println);

        ArrayList<Integer> numbers = new ArrayList<>();
        int nums[] = new int[10];
        Arrays.fill(nums, 10);
        System.out.println(Arrays.toString(nums));

        Arrays.stream(nums).forEach((a) -> System.out.println(++a));
        System.out.println(Arrays.toString(nums));

        // parallel stream increase performance on a large amount of data
        // on a multi-core machines
        books.parallelStream().filter(book -> {return book.getAuthor().startsWith("J");})
                .forEach(System.out::println);



    }

    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Alice Walker", "The Color purple"));
        books.add(new Book("Alice Walker", "Meridian"));
        books.add(new Book("Toni Morrison", "Beloved"));
        books.add(new Book("Toni Morrison", "Paradise"));
        books.add(new Book("Jane Austin", "Emma"));
        books.add(new Book("Jane Austin", "Persuasion"));
        books.add(new Book("Jane Austin", "Pride and prejudice"));

        return books;
    }
}
