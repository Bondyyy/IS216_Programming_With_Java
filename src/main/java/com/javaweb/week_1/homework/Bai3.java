package com.javaweb.week_1.homework;
import java.util.Scanner;

class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void rutGon() {
        int ucln = uocChungLonNhat(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;
    }

    private int uocChungLonNhat(int a, int b) {
        if (b == 0) return a;
        return uocChungLonNhat(b, a % b);
    }

    public void inPhanSo() {
        System.out.println(tuSo + "/" + mauSo);
    }
}
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        try {
            System.out.print("Nhap tu so: ");
            int tuSo = scanIn.nextInt();
            System.out.print("Nhap mau so: ");
            int mauSo = scanIn.nextInt();

            if (mauSo == 0) {
                System.out.println("Mau so khong duoc bang 0. Vui long nhap lai.");
                return;
            }

            PhanSo phanSo = new PhanSo(tuSo, mauSo);
            phanSo.rutGon();
            System.out.print("Phan so sau khi rut gon: ");
            phanSo.inPhanSo();
        } catch (Exception e) {
            System.out.println("Loi du lieu nhap vao. Vui long nhap mot so nguyen.");
        } finally {
            scanIn.close();
        }
    }
}
