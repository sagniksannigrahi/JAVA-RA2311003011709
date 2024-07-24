package com.company;

public class methods {
    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b){ // ekhaner a oo b holo parameter
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    static void foo(int a, int b, int c){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    public static void main(String[] args) {
        // Method Overloading
        foo();
        foo(3000);
        foo(3000, 4000); // ekhner a oo b holo argument...// Argumnt are actual.
        // Arguments are actual!


    }
}
