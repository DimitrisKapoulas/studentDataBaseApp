package studentDBApp;

import java.util.Scanner;

public class studentDBApp {
    public static void main(String[] args) {
        // Ask how many new users we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        student[] students = new student[numOfStudents];

        // Create n number of new students
        for (int i = 0; i < numOfStudents ; i++) {
            students[i] = new student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].showInfo());
        }
    }
}
