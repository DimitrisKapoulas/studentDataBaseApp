package studentDBApp;

import java.util.Scanner;
public class student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

    // Constructor: prompt user to enter student's name and year

    public student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = scanner.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = scanner.nextLine();

        System.out.println("1 - Freshman\n2 - Softmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = scanner.nextInt();
        System.out.println(firstName+" "+lastName+" "+gradeYear);
    }

    // Generate an ID

    // Enroll in courses

    // View Balance

    // Pay tuition

    // Show status
}
