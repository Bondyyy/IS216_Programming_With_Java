package com.javaweb.homework.Cau1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    private List<KhachHang> khachHangList = new ArrayList<>();
    
    private boolean kiemTraHopLe(String maKH, String tenKH, String ngayHD, String loaiSuDung) {
        for (KhachHang kh : khachHangList) {
            if (kh.getMaKH().equals(maKH) && kh.getTenKH().equals(tenKH)) {
                
                if (!kh.getLoaiDien().equalsIgnoreCase(loaiSuDung)) {
                    return false;
                }
                
                if (kh.getNgayHoaDon().equals(ngayHD)) {
                    return false;
                }
            }
        }
        return true; 
    }
    
    public void inputKhachHang(){
        Scanner scanner = new Scanner(System.in);
       
        while(true) {
            System.out.printf("Ma KH: ");
            String maKH = scanner.nextLine();
            if (maKH.isEmpty() == true){break;}
            
            System.out.printf("Ten KH: ");
            String tenKH = scanner.nextLine();
            
            System.out.printf("Ngay HD: ");
            String ngayHD = scanner.nextLine();
            
            System.out.printf("So luong dien ");
            int soLuongDien = scanner.nextInt();
            
            System.out.printf("Don gia ");
            double donGia = scanner.nextInt();
            
            System.out.printf("Loai su dung: ");
            String loaiSuDung = scanner.nextLine();
            
            if (kiemTraHopLe(maKH, tenKH, ngayHD, loaiSuDung) == true){
                System.out.printf("Nhap lai");
                continue;
            }
            if (loaiSuDung.equals("Sinh Hoat")){
                System.out.printf("Dinh muc: ");
                int dinhMuc = scanner.nextInt();
                
                khachHangList.add(new SinhHoat(maKH, tenKH, ngayHD, 
                        soLuongDien,  donGia,  dinhMuc));
            }
            else if (loaiSuDung.equals("Kinh Doanh")){
                khachHangList.add(new KinhDoanh(maKH, tenKH, ngayHD, 
                        soLuongDien,  donGia));
            }
            else if (loaiSuDung.equals("Kinh Doanh")){
                System.out.printf("Loai pha: ");
                int loaiPha = scanner.nextInt();
               
                khachHangList.add(new LoaiSanXuat(maKH, tenKH, ngayHD, 
                        soLuongDien,  donGia, loaiPha));
            }
        }
    }
    public void outputKhachHang(){
        for (KhachHang kh: khachHangList){
            kh.inThongTinKhachHang();
        }
    }
}
