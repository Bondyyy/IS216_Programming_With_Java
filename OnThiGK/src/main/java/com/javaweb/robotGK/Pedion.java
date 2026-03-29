package com.javaweb.robotGK;

import java.util.Random;

public class Pedion extends Robot {
    private final int F;

    public Pedion() {
        super(20); 
        Random rand = new Random();
        this.F = rand.nextInt(5) + 1; 
    }
    
    public Pedion(int F) {
        super(20);
        this.F = F;
    }

    @Override
    public double tinhNangLuongTieuThu() {
        return M * S + (F + 1) * S / 2.0; 
    }

    @Override
    public void inThongTin() {
        System.out.printf("Pedion" + " M = " + M + " S = " + S + " F = " + F + " Nang luong: " + tinhNangLuongTieuThu());
    }
}