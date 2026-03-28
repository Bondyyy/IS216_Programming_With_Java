package com.javaweb.week_1.homework;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Bai2 {
    public void lietKeUocSoTangDan(int n) {
        if (n <= 0) {
            System.out.println("Nhap so nguyen duong");
            return;
        }

        Set<Integer> uocSoSet = new TreeSet<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                uocSoSet.add(i);        
                uocSoSet.add(n / i);     
            }
        }

        System.out.println("Cac uoc cua " + n + " theo thu tu tang dan: ");
      
        for (int uoc : uocSoSet) {
            System.out.print(uoc + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        
        try {
            System.out.print("Nhap vao so nguyen n: ");
            int n = scanIn.nextInt();

            Bai2 bai2 = new Bai2();
            bai2.lietKeUocSoTangDan(n);
        } catch (Exception e) {
            System.out.println("Loi du lieu nhap vao. Vui long nhap mot so nguyen duong.");
        } finally {
            scanIn.close();
        }
    }
}