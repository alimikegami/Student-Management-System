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

    public static void deleteStudent(ArrayList<Student> students) {
        // memeriksa ukuran array
        if (students.size() == 0) {
            System.out.println("No student records found");
            return;
        }

        // menerima user input
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the NIM of the student to be deleted: ");
        String NIM = userInput.nextLine();

        // menghapus elemen sesuai input user
        for (int i = 0; i < students.size(); i++) {
            if (NIM.equals(students.get(i).getNIM())) {
                students.remove(i);
                System.out.println("Successfully delete data with nim " + NIM);
                return;
            }
        }
        System.out.println("Failed to delete data");
        return;
    }
}
