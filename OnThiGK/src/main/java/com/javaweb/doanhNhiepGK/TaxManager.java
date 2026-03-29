/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaweb.doanhNhiepGK;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TaxManager {
    private List<DoanhNghiep> businessList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    
    private boolean isMaSoThueDuyNhat(String maSoThue){
        for (DoanhNghiep b:businessList){
            if(b.getMaSoThue().equals(maSoThue)) 
                return false; 
        }
        return true;
    }
    
    public void  inputBusinesses (){
        while (true) {
            System.out.println("\nNhap ma so thue");
            String taxCode = scanner.nextLine().trim();
            if (taxCode.isEmpty()) break; 

            if (isMaSoThueDuyNhat(taxCode) == false) {
                System.out.println("Ma so thue da ton tai");
                continue;
            }

            System.out.print("Ten doanh nghiep: ");
            String name = scanner.nextLine();
            System.out.print("Doanh thu nam ");
            double revenue = Double.parseDouble(scanner.nextLine());
            System.out.print("Linh vuc (VD: Giáo dục, Nông nghiệp...): ");
            String type = scanner.nextLine();
            System.out.print("So nhan vien: ");
            int employees = Integer.parseInt(scanner.nextLine());

            System.out.println("Loai doanh nghiep ");
            String loaiDoanhNghiep = scanner.nextLine().trim();

            switch (loaiDoanhNghiep) {
                case "Private Business":
                    System.out.print("Nam hoat dong: ");
                    int years = Integer.parseInt(scanner.nextLine());
                    businessList.add(new PrivateBusiness(taxCode, name, revenue, type, employees, years));
                    break;
                case "Limited Company":
                    System.out.print("So chi nhanh ");
                    int branchesTNHH = Integer.parseInt(scanner.nextLine());
                    businessList.add(new LimitedCompany(taxCode, name, revenue, type, employees, branchesTNHH));
                    break;
                case "Joint Stock Company":
                    System.out.print("da niem yet? ");
                    boolean isListed = Boolean.parseBoolean(scanner.nextLine());
                    System.out.print("So co dong ");
                    int shareholders = Integer.parseInt(scanner.nextLine());
                    System.out.print("So chi nhanh ");
                    int branchesCTCP = Integer.parseInt(scanner.nextLine());
                    businessList.add(new JointStockCompany(taxCode, name, revenue, type, employees, shareholders, branchesCTCP, isListed));
                    break;
                default:
                    System.out.println("Khong co loai doanh nghiep ");
            }
        }
    }
    public void printMinMaxTaxBusinesses() {
        if (businessList.isEmpty()) return;
        DoanhNghiep maxDN = businessList.get(0);
        DoanhNghiep minDN = businessList.get(0);
        
        for (DoanhNghiep b : businessList) {
            if (b.tinhThue() > maxDN.tinhThue()) {
                maxDN = b;
            }

            if (b.tinhThue() < minDN.tinhThue()) {
                minDN = b;
            }
        }
    }
    
    public void reportTaxStatistics() {
   
    double sumPri = 0, sumLim = 0, sumJoint = 0;
    int countPri = 0, countLim = 0, countJoint = 0;

    for (DoanhNghiep b : businessList) {
        if (b instanceof PrivateBusiness) {
            sumPri += b.tinhThue();
            countPri++;
        } else if (b instanceof LimitedCompany) {
            sumLim += b.tinhThue();
            countLim++;
        } else if (b instanceof JointStockCompany) {
            sumJoint += b.tinhThue();
            countJoint++;
        }
    }

    double avgPri = (countPri > 0) ? sumPri / countPri : 0;
    double avgLim = (countLim > 0) ? sumLim / countLim : 0;
    double avgJoint = (countJoint > 0) ? sumJoint / countJoint : 0;

    System.out.printf("Private Business: %.2f\n", avgPri);
    System.out.printf("Limited Company: %.2f\n", avgLim);
    System.out.printf("Joint Stock Company: %.2f\n", avgJoint);

    for (DoanhNghiep b : businessList) {
        if (b instanceof PrivateBusiness && b.tinhThue() > avgPri) {
            b.printInfo();
        } else if (b instanceof LimitedCompany && b.tinhThue() > avgLim) {
            b.printInfo();
        } else if (b instanceof JointStockCompany && b.tinhThue() > avgJoint) {
            b.printInfo();
        }
    }
}
}
