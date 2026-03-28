package com.javaweb.week_1.classwork;
import java.util.Scanner;

class Chuoi {
    private String x;

    Chuoi (String x){
        this.x = x;
    }
    
    public String getX() {
        return this.x;
    }

    public int chieuDaiCuaChuoi (){
        return x.length();
    } 
    
    public String nKiTuDau(int n){
        if (x.length() < n){
            return x;
        }
        return x.substring(0, n);
    }
    
    public String nKiTuCuoi(int n){
        if (x.length() < n){
            return x;
        }
        int len = x.length();
        return x.substring(len - n, len);
    }
    
    public char kiTuThuN(int n){
        try {
            return x.charAt(n - 1);
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Loi: Vi tri thu " + n + " vuot qua chieu dai chuoi.");
            return '\0'; 
        }
    }
    
    public static Chuoi taoChuoiCuaXVaY (Chuoi x, Chuoi y, int a, int b){
        String res = x.nKiTuDau(a) + y.nKiTuCuoi(b);
        return new Chuoi(res);
    }

    public boolean soSanhPhanBietHoaThuong(Chuoi other) {
        return this.x.equals(other.getX());
    }

    public boolean soSanhKhongPhanBiet(Chuoi other) {
        return this.x.equalsIgnoreCase(other.getX());
    }

    public int timViTriDauTien(Chuoi y) {
        return this.x.indexOf(y.getX());
    }

    public void inTatCaViTri(Chuoi y) {
        String chuoiCon = y.getX();
        if (chuoiCon.isEmpty()) return;

        int index = this.x.indexOf(chuoiCon);
        if (index == -1) {
            System.out.println("Khong xuat hien.");
            return;
        }
        
        System.out.print("Cac vi tri xuat hien: ");
        while (index >= 0) {
            System.out.print(index + " ");
            index = this.x.indexOf(chuoiCon, index + 1);
        }
        System.out.println();
    }
}

public class Bai4 {
    public static void main(String[] args){
        Scanner scanIn = new Scanner(System.in);

        System.out.print("Nhap chuoi x: ");
        Chuoi x = new Chuoi(scanIn.nextLine());
        
        System.out.print("Nhap chuoi y: ");
        Chuoi y = new Chuoi(scanIn.nextLine());

        System.out.println("1. Chieu dai chuoi x: " + x.chieuDaiCuaChuoi());
        
        System.out.println("2. 3 ki tu dau cua x: " + x.nKiTuDau(3));
        System.out.println("3. 3 ki tu cuoi cua x: " + x.nKiTuCuoi(3));
        
        char kiTu6 = x.kiTuThuN(6);
        if (kiTu6 != '\0') {
            System.out.println("4. Ki tu thu 6 cua x la: " + kiTu6);
        }
        
        Chuoi chuoiMoi = Chuoi.taoChuoiCuaXVaY(x, y, 3, 3);
        System.out.println("5. Chuoi moi ghep tu x va y: " + chuoiMoi.getX());
      
        System.out.println("6. x va y co giong nhau phan biet hoa thuong " + x.soSanhPhanBietHoaThuong(y));
        System.out.println("7. x va y co giong nhau khong phan biet? " + x.soSanhKhongPhanBiet(y));
        
        int viTri = x.timViTriDauTien(y);
        if (viTri != -1) {
            System.out.println("8. y xuat hien trong x lan dau tai index: " + viTri);
        } else {
            System.out.println("8. y khong xuat hien trong x.");
        }
        
        System.out.print("9. Tat ca vi tri cua y trong x: ");
        x.inTatCaViTri(y);
        
        scanIn.close();
    }
}