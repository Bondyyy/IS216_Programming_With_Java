package com.javaweb.week_1.classwork;
import java.util.Scanner;
        
public class Bai2 {
    public static float tinhThuong(float a, float b){
        if (b == 0) {
            System.out.println("Loi khong the chia cho 0!");
            return 0;
        }
        return a / b;
    } 
    public static void main(String[] args){
        Scanner scanIn = new Scanner (System.in) ;
        float a = scanIn.nextFloat(); 
        float b = scanIn.nextFloat();
        System.out.println("Nhap vao 2 so a va b: ");
        
        float ketQua = tinhThuong(a, b);
        System.out.println("Ket qua cua phep thuong la: ");
        System.out.printf("%.3f", ketQua);
        
    }
}
