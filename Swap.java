package com.company;

public class Swap {

    public static void main(String[] args) {
        int a, b, temp;
        a = 123;
        b = 526;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping : a, b = "+a+", "+ + b);
    }
}
