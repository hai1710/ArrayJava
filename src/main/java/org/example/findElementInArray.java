package org.example;

import java.util.Scanner;

public class findElementInArray {
    public static void main(String[] args) {
        String studen[] = {"Dũng","Sơn","Hải","Hiếu","Công","Nam"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm: ");
        String nhap = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < studen.length ; i++){
            if (studen[i].equals(nhap)){
                System.out.println(studen[i] + " ở vị trí: " + (i+1));
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("không tìm thấy");
        }
    }
}
