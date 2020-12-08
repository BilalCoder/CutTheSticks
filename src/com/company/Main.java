package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(len);
        int min, temp;
        Arrays.sort(arr);
        for (int i=0; i<len; i++) {
            if (arr[i] > 0) {
                temp = arr[i];
                for (int j = 0; j < len; j++) {
                    arr[j] = arr[j] - temp;
                }
                int count = 0;
                for (int k = 0; k < len; k++) {
                    if(arr[k]>0)
                        count++;
                }
                if(count>0) System.out.println(count);
            }
        }
    }
}
