package org.example;

import java.util.Scanner;

public class deleteValueArray {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int delete = 7;
        int arr[];
        int size;
        Scanner scanner = new Scanner(System.in);
        int index;
        do{
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("size does not exceed 20.");
            }
        } while (size > 20);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Enter element " + i+1 +":");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Value to delete: ");
        index = scanner.nextInt();
        int newArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == index) {
                for (int j = i; j < arr.length; j++) {
                    if (j + 1 > arr.length - 1) {
                        newArr[j] = 0;
                        break;
                    } else {
                        newArr[j] = arr[j + 1];
                    }
                }
                break;
            }
            newArr[i] = arr[i];
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }

}
