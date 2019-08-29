package studentDBApp;

import java.util.Scanner;

public class student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;
    // Constructor: prompt user to enter student's name and year

    public student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = scanner.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = scanner.nextLine();

        System.out.println("1 - Freshman\n2 - Softmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = scanner.nextInt();

        setStudentID();
        System.out.println(firstName+" "+lastName+" "+gradeYear + " " + studentID);
    }

    // Generate an ID
    private void setStudentID(){
        // Grade Level + ID
        id++;
        this.studentID = gradeYear + "" +id;
    }

    // Enroll in courses

    // View Balance

    // Pay tuition

    // Show status
}
