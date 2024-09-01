package com.shuffled;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        String[] colours=new String[5];
        colours[0]="purple";
        colours[1]="blue";

        System.out.println(Arrays.toString(colours));

        int[] numbers=new int[2];
        numbers[0]=5;
        numbers[1]=17;
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < colours.length; i++) {
            System.out.println(colours[i]);
        }
        for (String colour : colours) {
            System.out.println(colour);
        }
        for (int i = colours.length-1; i >=0; i--) {
            System.out.println(colours[i]);
        }

        int a=Arrays.binarySearch(numbers,4);
        System.out.println(a);
    }
}
