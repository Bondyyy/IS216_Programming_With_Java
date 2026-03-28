package com.javaweb.week_1.homework;
import java.util.Scanner;
import java.util.Arrays;

class matrix {
    private int[][] arr;
    private int row;
    private int col;

    public matrix(int row, int col) {
        this.row = row;
        this.col = col;
        arr = new int[row][col];
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mang 2 chieu co " + row + " hang va " + col + " cot (gia tri tu 0 den 100):");
        int x;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                x = scanner.nextInt();
                if (x < 0 || x > 100) {
                    System.out.println("Gia tri khong hop le. Vui long nhap mot so tu 0 den 100.");
                    j--; 
                } else {
                    arr[i][j] = x;
                }
            }
        }
    }

    public void display() {
        System.out.println("Ma tran");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void findMax() {
        int max = arr[0][0];
        int indexRow = 0;
        int indexCol = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    indexRow = i;
                    indexCol = j;
                }
            }
        }
        System.out.println("Gia tri lon nhat trong ma tran: " + max);
        System.out.println("Vi tri cua gia tri lon nhat: [" + indexRow + "][" + indexCol + "]");
        System.out.println();
    }

    private int checkSoNguyenTo(int n) {
        if (n < 2) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public void printSoNguyenTo() {
        System.out.println("Cac so nguyen to trong ma tran:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (checkSoNguyenTo(arr[i][j]) == 1) {
                    System.out.print(arr[i][j] + " ");
                }
                else System.out.print( "0 ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public matrix sortByColMatrix() {
        matrix sortedMatrix = new matrix(row, col);
        for (int j = 0; j < col; j++) {
            int[] columnArray = new int[row];
            for (int i = 0; i < row; i++) {
                columnArray[i] = arr[i][j];
            }
            Arrays.sort(columnArray);
            for (int i = 0; i < row; i++) {
                sortedMatrix.arr[i][j] = columnArray[i];
            }
        }
        return sortedMatrix;
    } 
}
public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so hang: ");
        int row = scanner.nextInt();
        System.out.print("Nhap vao so cot: ");
        int col = scanner.nextInt();

        matrix m = new matrix(row, col);
        m.input();
        m.display();
        m.findMax();
        m.printSoNguyenTo();
        System.out.println("Ma tran sau khi sap xep theo cot:");
        m.sortByColMatrix().display();
    }
}
