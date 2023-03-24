package org.example;

import java.util.Scanner;

public class mergeArray {
    public static void main(String[] args) {
//        int arr1[] = {1,2,3,4,5};
//        int arr2[] = {6,7,8,9,10};
        int arr1[];
        int size1;
        int arr2[];
        int size2;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a Size of array 1:");
            size1 = sc.nextInt();
            if (size1 > 20) {
                System.out.println("Size does not exceed 20.");
            }
        } while (size1 > 20);
        arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++){
            System.out.println("Enter element " + (i+1) + ":");
            arr1[i] = sc.nextInt();
        }
        do {
            System.out.println("Enter a Size of array 2:");
            size2 = sc.nextInt();
            if (size2 > 20) {
                System.out.println("Size does not exceed 20.");
            }
        } while (size2 > 20);
        arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++){
            System.out.println("Enter element " + (i+1) + ":");
            arr2[i] = sc.nextInt();
        }
        int arr3[] = new int[(arr1.length + arr2.length)];
        for (int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++){
            arr3[(arr1.length + j)] = arr2[j];
        }
        System.out.print("Array 3: ");
        for (int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i] + ",");
        }
    }

}
