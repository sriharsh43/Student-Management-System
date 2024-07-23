package studentddatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        //Ask how many students we want to add
        System.out.println("Enter how many new students enroll the course : ");
        Scanner in = new Scanner(System.in);
        int numofStudents = in.nextInt();
        Student[] students = new Student[numofStudents];

        //Create n number of new students
        for (int n = 0; n < numofStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payFees();

        }
        for (int n = 0; n < numofStudents; n++) {
            System.out.println(students[n].toString());
        }
    }
}
