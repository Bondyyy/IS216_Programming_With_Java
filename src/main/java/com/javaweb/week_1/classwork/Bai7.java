package com.javaweb.week_1.classwork;
import java.util.Scanner;

class KiemTraSoNguyenTo {
    private int so;
    
    KiemTraSoNguyenTo (int so){
        this.so = so;
    }
    
    public int checkSoNguyenTo(){
        if (so < 2) return 0;
        for (int i = 2; i <= Math.sqrt(so); i++){
            if (so % i ==0) return 0;
        }
        return 1;
    }
    
}
public class Bai7 {
    public static void main(String[] args) {
         Scanner scanIn = new Scanner(System.in);
         System.out.print("Nhap mot so nguyen: ");
         int inputSo = scanIn.nextInt();
         KiemTraSoNguyenTo x = new KiemTraSoNguyenTo (inputSo);
         int check = x.checkSoNguyenTo();
         
         if (check != 0) {
            System.out.println("So " + inputSo + " la so nguyen to."); 
        } else {
            System.out.println("So " + inputSo + " khong la so nguyen to."); 
        }
    }
}

