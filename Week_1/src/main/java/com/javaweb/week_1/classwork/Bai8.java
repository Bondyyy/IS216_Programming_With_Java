package com.javaweb.week_1.classwork;

import java.util.Scanner;
import java.util.Arrays; 

public class Bai8 {
    public static void main(String[] args){
        Scanner scanIn = new Scanner(System.in);
        int n;
        System.out.print("Nhap so phan tu: ");
        n = scanIn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            arr[i] = scanIn.nextInt();
        }
        System.out.println("Mang vua nhap la: " + Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++){
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Gia tri lon nhat trong mang la: " + max);
        System.out.println("Gia tri nho nhat trong mang la: " + min);

        int x;
        System.out.print("Nhap gia tri can tim: ");
        x = scanIn.nextInt();
        int index = Arrays.binarySearch(arr, x);
        if (index >= 0) {
            System.out.println("Gia tri " + x + " co trong mang va nam o vi tri: " + index);
        } else {
            System.out.println("Gia tri " + x + " khong co trong mang");
        }
        Arrays.sort(arr);
        System.out.println("Mang sau khi sap xep la: " + Arrays.toString(arr));
    }
}