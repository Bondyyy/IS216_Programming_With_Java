package com.javaweb.week_1.classwork;
import java.util.Scanner;

class PhanSo{
    private int tu, mau;
    
    PhanSo(int tu, int mau) {
        if (mau == 0) {
            throw new ArithmeticException("Loi mau so khong duoc bang 0");
        }
        this.tu = tu;
        this.mau = mau;
    }
    
    private static int timUCLN(int a, int b) {
    a = Math.abs(a); 
    b = Math.abs(b);
    while (b != 0) {
        int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
  
    public void rutGon() {
        int ucln = timUCLN(this.tu, this.mau);
        this.tu /= ucln;
        this.mau /= ucln;
    }
    
    public void hienThi() {
        if (mau == 1) System.out.println(tu);
        else if (mau < 0) System.out.println(-tu + "/" + Math.abs(mau));
        else System.out.println(tu + "/" + mau);
    }
    
    public static PhanSo congPhanSo(PhanSo ps1, PhanSo ps2){
        int tuMoi = ps1.tu * ps2.mau + ps2.tu * ps1.mau;
        int mauMoi = ps1.mau * ps2.mau;
        PhanSo ketQua = new PhanSo(tuMoi, mauMoi);
        ketQua.rutGon();
        return ketQua;
    }
    
    public static PhanSo truPhanSo(PhanSo ps1, PhanSo ps2){
        int tuMoi = ps1.tu * ps2.mau - ps2.tu * ps1.mau;
        int mauMoi = ps1.mau * ps2.mau;
        PhanSo ketQua = new PhanSo(tuMoi, mauMoi);
        ketQua.rutGon();
        return ketQua;
    }
    
    public static PhanSo nhanPhanSo(PhanSo ps1, PhanSo ps2){
        int tuMoi = ps1.tu * ps2.tu;
        int mauMoi = ps1.mau * ps2.mau;
        PhanSo ketQua = new PhanSo(tuMoi, mauMoi);
        ketQua.rutGon();
        return ketQua;
    }
    
    public static PhanSo chiaPhanSo(PhanSo ps1, PhanSo ps2){
        int tuMoi = ps1.tu * ps2.mau;
        int mauMoi = ps1.mau * ps2.tu;
        PhanSo ketQua = new PhanSo(tuMoi, mauMoi);
        ketQua.rutGon();
        return ketQua;
    }
    
}
public class Bai3 {
    
    public static void main(String[] args){
        Scanner scanIn = new Scanner(System.in);

        System.out.println("Nhap phan so 1: ");
        PhanSo ps1 = new PhanSo(scanIn.nextInt(), scanIn.nextInt());
        
        System.out.println("Nhap phan so 2: ");
        PhanSo ps2 = new PhanSo(scanIn.nextInt(), scanIn.nextInt());
  
        System.out.print("Tong: ");
        PhanSo.congPhanSo(ps1, ps2).hienThi();

        System.out.print("Hieu: ");
        PhanSo.truPhanSo(ps1, ps2).hienThi();

        System.out.print("Tich: ");
        PhanSo.nhanPhanSo(ps1, ps2).hienThi();

        System.out.print("Thuong: ");
        PhanSo.chiaPhanSo(ps1, ps2).hienThi();
    }
}
