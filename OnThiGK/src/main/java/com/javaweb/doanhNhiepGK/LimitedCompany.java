package com.javaweb.doanhNhiepGK;

class LimitedCompany extends DoanhNghiep {
    private int branches;
    
    public LimitedCompany(){}
    
    public LimitedCompany(String maSoThue, String tenDoanhNghiep, 
            double doanhThuNam, String linhVuc, int soNhanVien, int branches){
        super(maSoThue, tenDoanhNghiep, doanhThuNam, linhVuc, soNhanVien);
        this.branches = branches;
    }
    
    @Override
    public double tinhThue() {
        double thueCoBan = (doanhThuNam * 15.0)/(100.0);
        if (doanhThuNam < 2000000000){
            thueCoBan = thueCoBan - (thueCoBan * 10.0)/(100.0);
        }
        if (linhVuc.equalsIgnoreCase("Giao duc") ||
                linhVuc.equalsIgnoreCase("Nong nghiep") ){
            thueCoBan = thueCoBan - (thueCoBan * 3)/(100.0);
        }
        if (branches >= 5 ){
            thueCoBan = thueCoBan - (thueCoBan * 2)/(100.0);
        }
        return thueCoBan;
    }
    
    @Override
    public String moTaUuDai(){
        String ketQua = "";
        if (doanhThuNam < 2000000000){
            ketQua = ketQua + "Giam 10 % (Doanh thu < 2 ty)";
        }
        if (linhVuc.equalsIgnoreCase("Giao duc") ||
                linhVuc.equalsIgnoreCase("Nong nghiep") ){
            ketQua = ketQua + ", Giam 3 % (Hoat dong trong giao duc hoac nong nghiep)";
        }
        if (branches >= 5){
            ketQua = ketQua + ", Giam 2 % (Hoat dong co so chi nhanh >= 5)";
        }
        return ketQua;
    }
}
