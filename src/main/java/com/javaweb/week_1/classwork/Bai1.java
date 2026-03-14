/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.javaweb.week_1.classwork;
import java.util.Scanner;
/**
 *
 * @author Bondy
 */
public class Bai1 {
    public static void main(String[] args){
        Scanner scanIn=new Scanner(System.in); 
        String ten = ""; // Tên 
        int tuoi; // Tuổi 
        System.out.println("Nhap Ten va Tuoi: "); 
        ten = scanIn.nextLine();  
        tuoi = scanIn.nextInt(); 
        System.out.println("Ten " + ten + "!"); 
        System.out.println("Tuoi " + tuoi + "!");
    }
    
}
