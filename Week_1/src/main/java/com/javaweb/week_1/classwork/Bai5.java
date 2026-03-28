package com.javaweb.week_1.classwork;
import java.util.Scanner;

class tinhTienDien {
    private int soDien;
    
    tinhTienDien (int soDien){
        this.soDien = soDien;
    }
    
    public  int tienDienThang (int soDien ){
        int sum = 0;
        if (soDien <= 50){
            sum = soDien * 2000 ;
        }
        else if (soDien <= 100){
            sum = 50 * 2000 +  (soDien - 50) * 2500;
        }
        else {
            sum = 50 * 2000 + 50 * 2500 +  (soDien - 100) * 3500;
        }
        return sum;
    }
}
public class Bai5 {
    public static void main(String[] args){
        Scanner scanIn = new Scanner(System.in);

        System.out.print("Nhap so dien: ");
        int soDien = scanIn.nextInt();
        tinhTienDien x = new tinhTienDien(soDien);
        
        System.out.printf("So dien: %d kWh\n", soDien);
        System.out.printf("Tong tien dien phai tra: %,d VND\n", x.tienDienThang(soDien));
    }
}
