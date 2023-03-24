package org.example;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        int size;
        int arr[];
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("Size dose not exceed 20");
            }
        } while (size > 20);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++ ){
            System.out.println("Enter element " + (i+1) +":");
            arr[i] = sc.nextInt();
        }
        for ( int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr [arr.length - 1 - i];
            arr [arr.length - 1 - i] = temp;
        }
        System.out.println("Reverse Array");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(", ");
        }
    }
}
