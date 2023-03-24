package org.example;

import java.util.Scanner;

public class findMaxArray {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a Size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("size does not exceed 20");
            }
        } while (size > 20);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + (i+1) +":");
            arr[i] = sc.nextInt();
        }
//        int max = arr[0];
//         int index = 0;
//        for (int i = 0; i <arr.length; i++){
//            if (arr[i] > max ){
//                max = arr[i];
//                index = i + 1;
//            }
//        }
//        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
        int max = maxValue(arr);
        System.out.println("The largest property value in the list is " + arr[max] + " ,at position " + (max+1));
    }
    public static int maxValue(int[] arr){
        int max = 0;
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
