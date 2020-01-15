package sudentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args){
        /*Student std1 = new Student();
        std1.enroll();
        std1.payTuition();
        System.out.println(std1.toString());*/

        // Ask how many student we want to add
        System.out.print("Enter number of new students to enroll: ");
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        Student[] students = new Student[numberOfStudents];

        // Create n number of new students
        for (int i = 0; i<numberOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }

        for (int i = 0; i<numberOfStudents; i++){
            System.out.println(students[i].toString());
        }

    }
}
