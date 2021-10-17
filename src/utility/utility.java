/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.util.ArrayList;
import java.util.Scanner;
import student.Student;

/**
 *
 * @author alimi
 */
public class Utility {
    
    public static void addStudent(ArrayList<Student> students){
        String NIM, name, major, faculty, university;
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Insert NIM: ");
        NIM = userInput.nextLine();
        System.out.print("Insert Name: ");
        name = userInput.nextLine();
        System.out.print("Insert Major: ");
        major = userInput.nextLine();
        System.out.print("Insert Faculty: ");
        faculty = userInput.nextLine();
        System.out.print("Insert University: ");
        university = userInput.nextLine();
        students.add(new Student(NIM, name, major, faculty, university));
    }
    
    public static void showStudent(ArrayList<Student> students){
         if (students.size() == 0) {
             System.out.println("No student records found...");
             return;
         }
         
         for (int i = 0; i < students.size(); i++) {
            students.get(i).getStudentData();
             System.out.println("--------------------------------");
         }
    }
    
    public static void searchStudent(ArrayList<Student> students){
        if(students.size() == 0){
            System.out.println("Student List is Empty");
        }else{
            Scanner in = new Scanner(System.in);
            boolean finded = false;
            String nim, kd;
            int index = -1;
            
            System.out.print("Silahkan masukan nim mahasiswa yang ingin dicari :");
            nim = in.nextLine();
            
            for (int i = 0; i < students.size(); i++) {
                kd = students.get(i).getStudentNim();
                if(kd.compareTo(nim)==0){
                    index = i;
                    finded = true;
                }
            }
            
            if(finded == true){
                System.out.println("Data dengan nim "+nim+" tersedia. Berikut ini adalah detailnya");
                students.get(index).getStudentData();
            }else{
                System.out.println("Data yang dicari tidak ada");
            }
            
        }
        
    }
}
