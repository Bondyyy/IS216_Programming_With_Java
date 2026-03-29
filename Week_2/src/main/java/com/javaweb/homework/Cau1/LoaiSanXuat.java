/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaweb.homework.Cau1;

class LoaiSanXuat extends KhachHang{
    private int loaiPha;
    
    LoaiSanXuat(){};
    LoaiSanXuat(String maKhachHang, String tenKhachHang, String ngayHoaDon,
            int soLuongDien, double donGia, int loaiPha){
            super(maKhachHang, tenKhachHang, ngayHoaDon, soLuongDien, donGia);
            this.loaiPha = loaiPha;
    }
    
     public double thanhTien(){
        if (loaiPha == 2){
            if (soLuongDien > 200){
                return (soLuongDien * donGia) - (soLuongDien * donGia * 2.0)/100.0;
            }
            return (soLuongDien * donGia);
        }
        else {
            return (soLuongDien * donGia) - (soLuongDien * donGia * 3.0)/100.0;
        }
     }
     
     public void inThongTinKhachHang(){
         System.out.printf("Ma KH: " + maKhachHang + ", Ten KH: "+ tenKhachHang +
                 ", ngayHoaDon: "+ ngayHoaDon + ", soLuongDien: " + soLuongDien +
                 ", donGia: "+ donGia + ", loaiPha: " + loaiPha);
     }
     
     @Override
    public String getLoaiDien() {return "Loai San Xuat";}
}
