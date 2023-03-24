package org.example;

import java.util.Scanner;

public class findMinInArray {
    public static int minValue(int[] arr) {
        int min = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] arr;
        do {
            System.out.println("Enter a size");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Size does not exceed 20.");
            }
        } while(size >20);
        arr = new int[size];
        for (int i = 0;i < arr.length; i++){
            System.out.println("Enter element " + (i+1) + ":");
            arr[i] = scanner.nextInt();
        }
        int min = minValue(arr);
        System.out.println("the smallest element in the array is: " + arr[min]);
    }
}
