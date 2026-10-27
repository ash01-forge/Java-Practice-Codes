package Pack6;

import java.util.Scanner;

public class Course {
    String courseName;
    String instructor;
    int enrolledStudents;

    public Course(String courseName, String instructor, int enrolledStudents) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    void enrollStudent() {
        enrolledStudents++;
    }

    void dropStudent() {
        if (enrolledStudents > 0)
            enrolledStudents--;
    }

    void displayStudents() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Instructor: " + instructor);
        System.out.println("Enrolled Students: " + enrolledStudents);
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] c = new Course[3];
        for (int i = 0; i < c.length; i++) {
            System.out.println("Enter the Course Name:");
            String courseName = sc.nextLine();
            System.out.println("Enter the Course Instructor Name:");
            String instructor = sc.nextLine();
            System.out.println("Enter the  number of enrolled students:");
            int enrolledStudents = sc.nextInt();
            c[i] = new Course(courseName, instructor, enrolledStudents);
            sc.nextLine();
        }
        for (int i = 0; i < c.length; i++) {
            c[i].enrollStudent();
            c[i].dropStudent();
        }
        for (int i = 0; i < c.length; i++) {
            c[i].displayStudents();
        }

    }
}
