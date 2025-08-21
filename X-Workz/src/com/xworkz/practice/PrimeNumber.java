package com.xworkz.practice;
//Check whether a given number is a prime number or not
public class PrimeNumber {
    static boolean prime(int a){
        if (a<2) return false;
        for (int i=2;i*i<=a;i++){
            if (a%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(prime(8));
    }

}
