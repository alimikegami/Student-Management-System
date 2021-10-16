/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author alimi
 */
public class Student {
    private String NIM, name, major, faculty, university;
    
    public Student(String NIM, String name, String major, String faculty, String university) {
        this.NIM = NIM;
        this.name = name;
        this.major = major;
        this.faculty = faculty;
        this.university = university;
        
        System.out.println("Student record has been created!");
    }

    public String getNIM() {
        return this.NIM;
    }
    
    public void getStudentData(){
        System.out.println("NIM: " + this.NIM);
        System.out.println("Name: " + this.name);
        System.out.println("Major: " + this.major);
        System.out.println("Faculty: " + this.faculty);
        System.out.println("University: " + this.university);
    }
}
