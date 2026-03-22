package com.javaweb.week_1.homework;
import java.util.Scanner;


public class Bai4 {
    public int KiemTraSoHoanHao (int n) {
        if (n <= 1) return 0; 

        int tongUoc = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                tongUoc += i;
                if (i != 1 && i != n / i) { 
                    tongUoc += n / i;
                }
            }
        }
        return tongUoc == n ? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        try {
            System.out.print("Nhap vao so nguyen n: ");
            int n = scanIn.nextInt();

            Bai4 bai4 = new Bai4();
            if (bai4.KiemTraSoHoanHao(n) == 1) {
                System.out.println(n + " la so hoan hao.");
            } else {
                System.out.println(n + " khong phai la so hoan hao.");
            }
        } catch (Exception e) {
            System.out.println("Loi du lieu nhap vao. Vui long nhap mot so nguyen duong.");
        } finally {
            scanIn.close();
        }
    }
}
