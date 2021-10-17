/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import student.Student;
import utility.Utility;

/**
 *
 * @author alimi
 */
public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<Student>();
        boolean loop;
        loop = true;
        int pilihan;
        Scanner inputUser = new Scanner(System.in);
        while(loop){

            System.out.println("======== Student Management System ========");
            System.out.println("1.\tShow Student Data");
            System.out.println("2.\tSearch Student Data");
            System.out.println("3.\tAdd Student Data");
            System.out.println("4.\tUpdate Student Data");
            System.out.println("5.\tDelete Student Data");
            System.out.println("6.\tExit");
            System.out.print("Select action: ");
            pilihan = inputUser.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("=============================");
                    System.out.println("===== Show Student Data =====");
                    System.out.println("=============================");
                    Utility.showStudent(students);
                    
                break;
                case 2:
                    System.out.println("=============================");
                    System.out.println("==== Search Student Data ====");
                    System.out.println("=============================");
                    Utility.searchStudent(students);
                   
                break;
                case 3:
                    System.out.println("=============================");
                    System.out.println("===== Add Student Data ======");
                    System.out.println("=============================");
                    Utility.addStudent(students);
                break;
                case 4:
                    System.out.println("=============================");
                    System.out.println("==== Update Student Data ====");
                    System.out.println("=============================");
//                    Operasi.updateData();
                break;
                case 5:
                    System.out.println("=============================");
                    System.out.println("==== Delete Student Data ====");
                    System.out.println("=============================");
//                    Operasi.updateData();
                break;
                case 6:
                    System.out.println("Program exited..");
                    loop = false;
                break;
                default:
                    System.out.println("Input anda tidak ditemukan, mohon inputkan 1-5!");
                break;
            }
        }
    }
}
