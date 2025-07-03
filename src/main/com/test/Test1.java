package com.test;

public class Test1 {

    public String name(String str) {
        return str;
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test2 t2 = new Test2();
        System.out.println("hello " + t1.name("java 24"));
        t2.demo();
    }

}
