package com.xworkz.practice;

public class Swap {

    public static void main(String[] args) {
        int a= 5, b=10;
        System.out.println("before swap: "+a+" and "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap: "+a+" and "+b);
    }
}
