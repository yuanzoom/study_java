package com.study.d12_2;


import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        int[] arr ={5, 2, 3, 7, 9} ;

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}

