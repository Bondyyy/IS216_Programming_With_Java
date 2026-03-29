package com.javaweb.homework.Cau1;

class SinhHoat extends KhachHang{
    private int dinhMuc;
    
    SinhHoat(){};
    SinhHoat(String maKhachHang, String tenKhachHang, String ngayHoaDon,
            int soLuongDien, double donGia, int dinhMuc){
            super(maKhachHang, tenKhachHang, ngayHoaDon, soLuongDien, donGia);
            this.dinhMuc = dinhMuc;
    }
    
    @Override
     public double thanhTien(){
         if (soLuongDien <= dinhMuc){
             return ((1.0 * soLuongDien) * donGia);
         }
         else {
             return 1.0 *(dinhMuc * donGia) + (soLuongDien - dinhMuc) * 
                     donGia * 2;
         }  
     }
     
    @Override
     public void inThongTinKhachHang(){
         System.out.printf("Ma KH: " + maKhachHang + ", Ten KH: "+ tenKhachHang +
                 ", ngayHoaDon: "+ ngayHoaDon + ", soLuongDien: " + soLuongDien +
                 ", donGia: "+ donGia + ", dinhMuc: " + dinhMuc);
     }
     
    @Override
    public String getLoaiDien() {return "Sinh hoat";}
     
}
