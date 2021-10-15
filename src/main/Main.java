/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.util.Scanner;
import utility.utility;

/**
 *
 * @author alimi
 */
public class Main {
    public static void main(String[] args) throws IOException {
        boolean loop;
        loop = true;
        int pilihan;
        Scanner inputUser = new Scanner(System.in);
        while(loop){

            System.out.println("======== Student Management System ========");
            System.out.println("1.\tShow Student Data");
            System.out.println("2.\tSearch Student Data");
            System.out.println("3.\tAdd Student Data");
            System.out.println("4.\tDelete Student Data");
            
            System.out.print("Masukkan pilihan anda: ");
            pilihan = inputUser.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("=============================");
                    System.out.println("===== Show Student Data =====");
                    System.out.println("=============================");
                    Operasi.tampilkanData();
                break;
                case 2:
                    System.out.println("=============================");
                    System.out.println("==== Search Student Data ====");
                    System.out.println("=============================");
                    Operasi.cariData();
                break;
                case 3:
                    System.out.println("=============================");
                    System.out.println("===== Add Student Data ======");
                    System.out.println("=============================");
                    Operasi.tambahBuku();
                break;
                case 4:
                    System.out.println("=============================");
                    System.out.println("==== Delete Student Data ====");
                    System.out.println("=============================");
                    Operasi.updateData();
                break;
                default:
                    System.out.println("Input anda tidak ditemukan, mohon inputkan 1-5!");
                break;
            }
            loop = utility.getBool("Ulangi program");
        }
    }
}
