package studentddatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int  tutionBalance;
    private static int costOfcourse = 600;
    private static int id = 1000;


    //Constructor : prompt the student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first name of student : ");
        this.firstName = in.next();
        System.out.println("Enter the last name of student : ");
        this.lastName = in.next();
        System.out.println("1- Fresher\n2- Intermediate\n3 - Mid-level\n4 - Senior\nEnter student class level : ");
        this.gradeYear = in.nextInt();
        setStudentID();
//        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID );



    }
    //Generate an ID
    private void setStudentID(){
        // Gradelevel + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    //Enroll in courses

    public void enroll(){
        //Get inside a loop and user hits 0
        do {
            System.out.print("Enter a course to enoll : (Q : to quit) : ");
            Scanner in = new Scanner(System.in);
            String course = in.next();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tutionBalance = tutionBalance + costOfcourse;
            }else {
                break;
            }
        }while (1 != 0);
//        System.out.println("ENROLLED IN : " + courses);
    }

    //View Balance
    public void viewBalance(){
        System.out.println("Your balance is : $" + tutionBalance);
    }
    //Pay Fees
    public void payFees(){
        viewBalance();
        System.out.print("Enter your payment : $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tutionBalance = tutionBalance - payment;
        System.out.println("Thank you for the payment of $" + payment);
        viewBalance();
    }

    //Show status
    public String toString(){
        return "Name : " + firstName + " " + lastName +
                "\nGrade Level : " + gradeYear +
                "\nStudent ID : " + studentID +
                "\nCourses Enrolled : " + courses +
                "\nBalance : " + tutionBalance;
    }
}
