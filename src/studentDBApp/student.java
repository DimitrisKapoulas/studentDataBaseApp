package studentDBApp;

import java.util.Scanner;

public class student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "" ;
    private int tuitionBalance = 0;
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
    public void enroll(){
        // Get inside a loop, user hits 0
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses +=  "\n" + course;
                tuitionBalance += costOfCourse;
            }else{
                break;
            }
        }while ( 1 != 0);
    }

    // View Balance
    public void viewBalance(){
        System.out.println("Your Balance is: $" + tuitionBalance);
    }

    // Pay tuition
    public void payTuition(){
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // Show status
    public String showInfo(){
        return "Name: " + firstName + " " + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudent ID: " + studentID
                +"\nCourses Enrolled: " + courses
                +"\nBalance: $" + tuitionBalance;
    }
}
