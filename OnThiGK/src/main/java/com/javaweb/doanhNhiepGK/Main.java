package com.javaweb.doanhNhiepGK;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        TaxManager manager = new TaxManager();
        manager.inputBusinesses();
        manager.printMinMaxTaxBusinesses();
        manager.reportTaxStatistics();
    }
}