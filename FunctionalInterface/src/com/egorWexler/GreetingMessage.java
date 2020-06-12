package com.egorWexler;

@FunctionalInterface // has only ONE abstract method
public interface GreetingMessage {
    void greet(String name);
    // public abstract void test(); cannot be defined many
}
