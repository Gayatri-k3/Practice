package com.xworkz.gfg;

public class Array2ndLargest {
    static int secondLargest(int[] arr) {
        int largest= -1, second=-1;
        for (int j : arr) {
            if (j > largest) {
                second = largest;
                largest = j;
            } else if (j < largest && j > second) {
                second = j;
            }
            if (second == largest) return -1;
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr={1,5,9,7,9,9};
        System.out.println(secondLargest(arr));
    }
}
