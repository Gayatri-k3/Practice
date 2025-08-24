package com.xworkz.gfg;

import java.util.Arrays;

public class ReverseArray {
    static int[] getReverse(int[] arr) {
        for (int i = 2; i < arr.length/2; i++) {
            int t= arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=t;
        }
        return
    }
}
