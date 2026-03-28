package com.javaweb.week_1.classwork;
import java.util.Scanner;

public class Bai1 {
    public static final double PI = 3.14159;
    
    public static double tinhChuViHinhTron (double banKinh){
        return banKinh * 2 * PI;
    }
    
    public static void main(String[] args){
        Scanner scanIn = new Scanner(System.in);
        double banKinh = 0.0;
       
        System.out.println("Nhap vao ban kinh: ");
        banKinh = scanIn.nextDouble();
        System.out.println("Chu vi cua hinh tron la "+ tinhChuViHinhTron(banKinh));
    }
}
