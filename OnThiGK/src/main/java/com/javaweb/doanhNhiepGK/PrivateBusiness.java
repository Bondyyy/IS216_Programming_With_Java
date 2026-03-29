package com.javaweb.doanhNhiepGK;
import java.util.Scanner;


class PrivateBusiness extends DoanhNghiep{
    private int namHoatDong;
    
    public PrivateBusiness(){}
    
    public PrivateBusiness(String maSoThue, String tenDoanhNghiep, 
            double doanhThuNam, String linhVuc, int soNhanVien, int namHoatDong){
        super(maSoThue, tenDoanhNghiep, doanhThuNam, linhVuc, soNhanVien);
        this.namHoatDong = namHoatDong;
    }
    
    @Override
    public double tinhThue() {
        double thueCoBan = (doanhThuNam * 10)/(100.0);
        if (namHoatDong > 10){
            thueCoBan = thueCoBan - (thueCoBan * 2)/(100.0);
        }
        if (soNhanVien > 50){
            thueCoBan = thueCoBan - (thueCoBan * 1)/(100.0);
        }
        return thueCoBan;
    }
    
    @Override
    public String moTaUuDai(){
        String ketQua = "";
        if (namHoatDong > 10){
            ketQua = ketQua + "Giam 2 % (Nam hoat dong > 10)";
        }
        if (soNhanVien > 50){
            ketQua = ketQua + ", Giam 1 % (So Nhan Vien > 50)";
        }
        return ketQua;
    }
   
}

