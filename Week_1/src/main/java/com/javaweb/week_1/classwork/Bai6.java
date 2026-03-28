package com.javaweb.week_1.classwork;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        int luaChon = 0;

        do {
            System.out.println("##################################");
            System.out.println("1.                  Bai 1");
            System.out.println("2.                  Bai 2");
            System.out.println("3.                  Bai 3");
            System.out.println("4.                  Bai 4");
            System.out.println("5.                  Bai 5");
            System.out.println("6.                  Thoat");
            System.out.println("##################################");
            System.out.print("Chon chuc nang: ");

            luaChon = scanIn.nextInt();

            switch (luaChon) {
                case 1:
                    System.out.println("\n--- Dang chay Bai 1 ---");
                    Bai1.main(new String[0]); 
                    break;
                case 2:
                    System.out.println("\n--- Dang chay Bai 2 ---");
                    Bai2.main(new String[0]);
                    break;
                case 3:
                    System.out.println("\n--- Dang chay Bai 3 ---");
                    Bai3.main(new String[0]);
                    break;
                case 4:
                    System.out.println("\n--- Dang chay Bai 4 ---");
                    Bai4.main(new String[0]);
                    break;
                case 5:
                    System.out.println("\n--- Dang chay Bai 5 ---");
                    Bai5.main(new String[0]);
                    break;
                case 6:
                    System.out.println("\nDang thoat chuong trinh. Tam biet!");
                    break;
                default:
                    System.out.println("\nLua chon khong hop le. Vui long chon tu 1 den 6.");
                    break;
            }
            System.out.println(); 
            
        } while (luaChon != 6); 

        scanIn.close(); 
    }
}