package com.javaweb.homework.Cau1;

abstract class KhachHang {
    protected String maKhachHang, tenKhachHang, ngayHoaDon;
    protected int soLuongDien;
    protected double donGia;
    
    
    KhachHang(){};
    KhachHang(String maKhachHang, String tenKhachHang, String ngayHoaDon,
            int soLuongDien, double donGia){
        this.donGia = donGia;
        this.maKhachHang = maKhachHang;
        this.ngayHoaDon = ngayHoaDon;
        this.soLuongDien = soLuongDien;
        this.tenKhachHang = tenKhachHang;
    };
    
    public String getMaKH(){
        return maKhachHang;
    }
    public String getTenKH(){
        return tenKhachHang;
    }
    public String getNgayHoaDon(){
        return ngayHoaDon;
    }
    public abstract double thanhTien();
    public abstract void inThongTinKhachHang();
    public abstract String getLoaiDien();
    
    
}
