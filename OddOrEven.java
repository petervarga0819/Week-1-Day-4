package com.company;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a number");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}