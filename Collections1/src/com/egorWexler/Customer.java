package com.egorWexler;

public class Customer {
    private boolean served;
    private String name;

    public Customer(String name){
        served = false;
        this.name = name;
    }
    public void serve() {
        served = true;
    }

    @Override
    public String toString() {
        return name;
    }

}