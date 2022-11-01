package com.hashMapWork;


import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        //put, get
        HashMap<Integer,String> customer = new HashMap<Integer,String>();

        customer.put(101,"saif");
        customer.put(102,"asif");
        customer.put(103,"rimon");

        System.out.println(customer.get(101));
        System.out.println(customer.get(102));
        System.out.println(customer.get(103));

    }
}
