package sudentdatabaseapp;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses = " ";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // constructor: prompt user to enter the student names and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student firstName:");
        this.firstName = in.nextLine();

        System.out.print("Enter student lastName:");
        this.lastName = in.nextLine();

        System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();
        setStudentId();
    }


    // Generate an unique Id for each student
    private void setStudentId(){
        // Grade level + ID
        id++;
        this.studentId = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll(){
        do{
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")){
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }else {
                break;
            }
        } while (1 != 0);
    }

    // View balance
    public void viewBalance(){
        System.out.println("Your Balance is: $" + tuitionBalance);
    }

    // Pay tuition
    public void payTuition(){
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payments of $" + payment);
        viewBalance();
    }

    // Show status
    public String toString(){
        return "Name:" + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentId +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
