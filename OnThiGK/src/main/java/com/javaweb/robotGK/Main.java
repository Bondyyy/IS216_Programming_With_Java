package com.javaweb.robotGK;

import java.util.Scanner;

public class Main {
    static Robot [] nhapThongTinRobot(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong robot Pedion (A): ");
        int A = scanner.nextInt();
        System.out.print("Nhap so luong robot Zattacker (B): ");
        int B = scanner.nextInt();
        System.out.print("Nhap so luong robot Carrier (C): ");
        int C = scanner.nextInt();
        
        int tongRobot = A + B + C;
        Robot [] R = new Robot[tongRobot];
        int index = 0;
        for(int i = 0; i < A; i++){
            R[index] = new Pedion();
            index ++;
        }
        for(int i = 0; i < B; i++){
            R[index] = new Zattacker();
            index ++;
        }
        for(int i = 0; i < C; i++){
            R[index] = new Carrier();
            index ++;
        }
        return R;
    }
    
    static void inTongNangLuongTheoLoai(Robot R[]){
        double pE =0, zE = 0, cE = 0;
        for (Robot rb : R){
            if (rb instanceof Pedion){
                pE += rb.tinhNangLuongTieuThu();
            }
            else if (rb instanceof Zattacker){
                zE += rb.tinhNangLuongTieuThu();
            } 
            else if (rb instanceof Carrier){
                cE += rb.tinhNangLuongTieuThu();
            } 
        }
        double maxx = -1;
        if (pE >= zE & pE >= cE){
            maxx = pE;
        }
        else if (zE >= pE & zE >= cE){
            maxx = zE;
        }
        else if (cE >= pE & cE >= zE){
            maxx = cE;
        }
        
        System.out.printf("Nang luong cua Pedion la: "+ pE);
        System.out.println();
        System.out.printf("Nang luong cua Zattacker la: "+ zE);
        System.out.println();
        System.out.printf("Nang luong cua Carrier la: "+ cE);
        System.out.println();
        System.out.printf("Nang luong lon nhat la: "+ maxx);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Robot[] R = nhapThongTinRobot();
        inTongNangLuongTheoLoai(R);
    }
}
