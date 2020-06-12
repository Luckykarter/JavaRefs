package com.egorWexler;

public class Main {

    public static void main(String[] args) {

        // anonymous inner class
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };

        gm.greet("Egor");

        // lambdas
        GreetingMessage gm2 = (String name) -> {
            System.out.println("Hello again, " + name);
        };

        gm2.greet("Egor");

        MessagePrinter mp = () -> {
            System.out.println("Print message");
        };

        mp.printMessage();


    }





}
