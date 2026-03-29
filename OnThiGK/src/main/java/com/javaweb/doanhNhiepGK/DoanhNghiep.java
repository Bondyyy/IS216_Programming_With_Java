package com.javaweb.doanhNhiepGK;


abstract class DoanhNghiep {
    protected String maSoThue, tenDoanhNghiep, linhVuc;
    protected double doanhThuNam;
    protected int soNhanVien;
    
    DoanhNghiep(){}
    DoanhNghiep(String maSoThue, String tenDoanhNghiep, 
            double doanhThuNam, String linhVuc, int soNhanVien){
        this.maSoThue = maSoThue;
        this.tenDoanhNghiep = tenDoanhNghiep;
        this.doanhThuNam = doanhThuNam;
        this.linhVuc = linhVuc;
        this.soNhanVien = soNhanVien;
    }
    
    public String getMaSoThue (){
        return maSoThue;
    }
    
    public abstract double tinhThue();
    public void printInfo(){
        System.out.printf("MST: " + maSoThue + " Ten DN: "+ 
                tenDoanhNghiep + " Loai DN: " + linhVuc + 
                " So tien thue nop: "+ tinhThue());
    }
    public abstract String  moTaUuDai();
}