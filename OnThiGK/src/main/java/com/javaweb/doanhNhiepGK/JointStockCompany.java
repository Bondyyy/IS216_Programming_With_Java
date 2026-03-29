package com.javaweb.doanhNhiepGK;

class JointStockCompany extends DoanhNghiep {
    private int soLuongCoDong, soLuongChiNhanh;
    private boolean isListed;
    
    JointStockCompany(){};
    JointStockCompany(String maSoThue, String tenDoanhNghiep, 
            double doanhThuNam, String linhVuc, int soNhanVien, int soLuongCoDong,
            int soLuongChiNhanh, boolean isListed){
        super(maSoThue,  tenDoanhNghiep, doanhThuNam,  linhVuc,  soNhanVien);
        this.isListed = isListed;
        this.soLuongChiNhanh = soLuongChiNhanh;
        this.soLuongCoDong = soLuongCoDong;
    }
    
    @Override
    public double tinhThue() {
        double thueCoBan = (doanhThuNam * 20.0)/(100.0);
        if (isListed == true){
            thueCoBan = thueCoBan - (thueCoBan * 5.0)/(100.0);
        }
        if (soLuongCoDong > 1000){
            thueCoBan = thueCoBan - (thueCoBan * 3)/(100.0);
        }
        if (soLuongChiNhanh >= 5 ){
            thueCoBan = thueCoBan - (thueCoBan * 2)/(100.0);
        }
        return thueCoBan;
    }
    
    @Override
    public String moTaUuDai() {
        String ketQua = "";
        if (isListed == true){
            ketQua += "Giam 5% (Niem yet tren san)";
        }
        if (soLuongCoDong > 1000){
            ketQua += ", Giam 3% (So luong co dong > 1000)";
        }
        if (soLuongChiNhanh >= 5 ){
            ketQua += ", Giam 2% (So luong chi nhanh >= 5)";
        }
        return ketQua;
    }
}
