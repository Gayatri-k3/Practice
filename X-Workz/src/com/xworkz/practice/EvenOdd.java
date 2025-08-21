package com.xworkz.practice;
//Write a program to check whether a number is even or odd.
public class EvenOdd {
    static String evenOdd(int num){
        if (num%2==0) return "even";
        return "odd";
    }

    public static void main(String[] args) {
        System.out.println(evenOdd(-2));
    }
}
