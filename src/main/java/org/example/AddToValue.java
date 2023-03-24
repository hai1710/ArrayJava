package org.example;

import java.util.Scanner;

public class AddToValue {
    public static void main(String[] args) {
        int arr[];
        int size;
        int index;
        int value;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a Size:");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20.");
            }
        } while (size > 20);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter element " + (i+1) + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Value to add:");
        value = sc.nextInt();
        System.out.println("Add value to the position:");
        index = sc.nextInt();
//        int arr[] = {1,2,3,4,5,6,7,8};
//        int index = 3;
//        int value = 9;
        int newArr[] = new int[arr.length+1];
        for (int i = 0; i <arr.length; i++){
            if ( i == index - 1){
                newArr[i] = value;
                for (int j = i + 1; j < newArr.length; j++){
                    newArr[j] =  arr[j-1];
                }
                break;
            }
           newArr[i] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]);
        }
    }
}
