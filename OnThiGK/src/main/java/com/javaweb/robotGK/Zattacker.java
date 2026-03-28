package com.javaweb.robotGK;

import java.util.Random;

public class Zattacker extends Robot {
    private int P;

    public Zattacker() {
        super(20); 
        Random rand = new Random();
        this.P = rand.nextInt(11) + 20; //0-10 + 20 = 20 - 30
    }

    @Override
    public double tinhNangLuongTieuThu() {
        return M * S + P * P * S;
    }

    @Override
    public void inThongTin() {
        System.out.printf("Zattacker" + " M = " + M + " S = " + S + " F = " + P + " Nang luong: " + tinhNangLuongTieuThu());
    }
}