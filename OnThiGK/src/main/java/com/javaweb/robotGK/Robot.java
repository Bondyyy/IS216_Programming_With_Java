package com.javaweb.robotGK;

public abstract class Robot {
    protected double M;
    protected static final double S = 10; 

    public Robot() {
    }

    public Robot(double M) {
        this.M = M;
    }

    public abstract double tinhNangLuongTieuThu();
    public abstract void inThongTin();
}