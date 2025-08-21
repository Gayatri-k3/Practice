package com.xworkz.practice;

//Find the factorial of a given number using loops and recursion.
public class Factorial {
        static Integer fact(int num){
            int a=1;
            for (int i = 1; i<=num; i++){
                a*=i;
            }
            return a;
        }

    public static void main(String[] args) {
        System.out.println(fact(3));
    }
}
