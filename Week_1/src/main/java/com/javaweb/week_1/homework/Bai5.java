package com.javaweb.week_1.homework;

import java.util.Scanner;
import java.util.Arrays;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        int n = 0;
        int[] arrA = null;

        try {
            System.out.print("Nhap vao so phan tu cua mang A: ");
            n = scanIn.nextInt();
            arrA = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Nhap vao phan tu thu " + (i + 1) + ": ");
                arrA[i] = scanIn.nextInt();
            }
            System.out.println("Mang A: " + Arrays.toString(arrA));
        } catch (Exception e) {
            System.out.println("Loi nhap lieu mang A.");
            return;
        }
        int arrB[] = null;
        try {
            System.out.print("\nNhap vao so phan tu cua mang B: ");
            int m = scanIn.nextInt();
            arrB = new int[m];
            for (int i = 0; i < m; i++) {
                arrB[i] = (int) (Math.random() * 100);
            }
            System.out.println("Mang B: " + Arrays.toString(arrB));
        } catch (Exception e) {
            System.out.println("Loi nhap lieu mang B.");
        }

        int [] arrC = null;
        try {
            if (arrA != null) {
                
                arrC = Arrays.copyOf(arrA, n);
                
                System.out.println("\nMang C:");
                System.out.println(Arrays.toString(arrC));
            }
            if (arrB.length >= 3 && arrC.length >= 3) {
                int srcPos = arrB.length - 3; 
                int destPos = 0; 
                System.arraycopy(arrB, srcPos, arrC, destPos, 3);
                System.out.println("\nMang C sau khi thay the 3 phan tu dau bang 3 phan tu cuoi cua B:");
                System.out.println(Arrays.toString(arrC));
    } else {
        System.out.println("\nLoi: Mang B hoac C khong du 3 phan tu de thuc hien thay the.");
    }
        } catch (Exception e) {
            System.out.println("Loi khi tao mang C: " + e.getMessage());
        } finally {
            scanIn.close();
        }
    }
}