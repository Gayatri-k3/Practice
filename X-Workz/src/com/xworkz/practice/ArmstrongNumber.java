package com.xworkz.practice;

public class ArmstrongNumber {
    static Boolean isArmstrong(Integer num){
        String sPower = Integer.toString(num);
        int power = sPower.length();
        int output =0;
        for (char c: sPower.toCharArray() ){
            output+=(int)Math.pow(c-'0',power);
        }
        return output == Integer.parseInt(sPower);
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(1634));

    }
}
