package com.javaweb.homework.Cau1;

class KinhDoanh extends KhachHang{
    
    KinhDoanh(){};
    KinhDoanh(String maKhachHang, String tenKhachHang, String ngayHoaDon,
            int soLuongDien, double donGia){
            super(maKhachHang, tenKhachHang, ngayHoaDon, soLuongDien, donGia);
    }
    
     public double thanhTien(){
         if(soLuongDien >= 400){
             return (1.0 * (soLuongDien * donGia) * 105)/100 ;
         }
         return 1.0 * (soLuongDien * donGia);
     }
     
     public void inThongTinKhachHang(){
         System.out.printf("Ma KH: " + maKhachHang + ", Ten KH: "+ tenKhachHang +
                 ", ngayHoaDon: "+ ngayHoaDon + ", soLuongDien: " + soLuongDien +
                 ", donGia: "+ donGia);
     }
     @Override
    public String getLoaiDien() {return "Kinh Doanh";}
}
