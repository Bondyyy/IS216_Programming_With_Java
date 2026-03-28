package com.javaweb.week_1.homework;
import java.util.Scanner;

class SoBoiVaUoc{
    private int a, b;
    public SoBoiVaUoc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int uocChungLonNhat(int a, int b) {
        if (b == 0) return a;
        return uocChungLonNhat(b, a % b);
    }

    public int boiChungNhoNhat(int a, int b) {
        return (a * b) / uocChungLonNhat(a, b);
    }
}
public class Bai1 {
    public static void main(String[] args)  {
        Scanner scanIn = new Scanner(System.in);
        int a, b;
        System.out.print("Nhap so a: ");
        a = scanIn.nextInt();
        System.out.print("Nhap so b: ");
        b = scanIn.nextInt();
        SoBoiVaUoc soBoiVaUoc = new SoBoiVaUoc(a, b);
        System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la: " + soBoiVaUoc.uocChungLonNhat(a, b));
        System.out.println("Boi chung nho nhat cua " + a + " va " + b + " la: " + soBoiVaUoc.boiChungNhoNhat(a, b));
    }
}
