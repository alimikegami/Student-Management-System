/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasi;

import java.util.ArrayList;
import java.util.Scanner;
import student.Student;
/**
 *
 * @author Indra permana Putra
 */
public class Operasi {
    public static void UpdateDataMahasiswa (ArrayList<Student> students){
        String name, major, faculty, university;
        if (students.size() == 0) {
            System.out.println("No student records found");
            return;
        }
        // menerima user input
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the NIM of the student to be Update: ");
        String NIM = userInput.nextLine();

        // menghapus elemen sesuai input user
        for (int i = 0; i < students.size(); i++) {
            if (NIM.equals(students.get(i).getNIM())) {
                students.remove(i);
                //setelah di hapus maka akan dinputkan data yang baru dari user
                System.out.println("Successfully delete data with nim " + NIM);
                System.out.print("Insert New Data ");
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
                System.out.println("Successfully Update data with nim " + NIM);
                return;
            }
        }
        System.out.println("Failed to Update data");
    }
    
}
