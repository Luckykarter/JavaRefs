package com.egorWexler;

import java.util.LinkedList;

public class Store {

    public static void main() {
        LinkedList<Customer> queue = new LinkedList<>();
        queue.add(new Customer("Volodya"));
        queue.add(new Customer("Egor"));
        queue.add(new Customer("Fred"));
        queue.add(new Customer("George"));
        System.out.println(queue);

        serveCustomer(queue);
        System.out.println(queue);

    }

    static void serveCustomer(LinkedList<Customer> queue) {
        Customer c = queue.pop();
        System.out.println("Serving customer: " + c);
        c.serve();

    }
}
