package com.javaweb.robotGK;

import java.util.Random;

public class Carrier extends Robot {
    private int E;

    public Carrier() {
        super(20); 
        Random rand = new Random();
        this.E = rand.nextInt(11) + 20; //0-10 + 50 = 50 - 30
    }

    @Override
    public double tinhNangLuongTieuThu() {
        return M * S + 4 * E * S;
    }

    @Override
    public void inThongTin() {
        System.out.printf("Zattacker" + " M = " + M + " S = " + S + " F = " + E + " Nang luong: " + tinhNangLuongTieuThu());
    }
}