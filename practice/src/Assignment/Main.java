package Assignment;

class User {
    String name;
    String email;

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public void performRole() {
    }

}

class Student extends User {
    String courseName;
    private String viewGrades;

    public String getViewGrades() {
        return viewGrades;
    }

    public void setViewGrades(String viewGrades) {
        this.viewGrades = viewGrades;
    }

    public Student(String email, String name, String courseName, String viewGrades) {
        super(email, name);
        this.courseName = courseName;
        this.viewGrades = viewGrades;
    }

    void enrollCourse(String courseName) {
        System.out.println("Course Enrolled: " + courseName);
    }

    void viewGrades() {
        System.out.println("Grades: " + viewGrades);
    }

    public void performRole() {
        enrollCourse(courseName);
        viewGrades();
    }
}

class Teacher extends User {
    String courseName;

    public Teacher(String email, String name, String courseName) {
        super(email, name);
        this.courseName = courseName;
    }

    void createCourse(String courseName) {
        System.out.println("Course Created: " + courseName);
    }

    public void performRole() {
        System.out.println("Course Taught: " + courseName);
    }

}

class Administrator extends User {
    String userName;
    private String[] user = new String[50];
    private int count = 0;

    public Administrator(String email, String name, String userName, String user) {
        super(email, name);
        this.userName = userName;
        this.user[count] = user;
        count++;
    }

    void addUser(String userName) {
        user[count] = userName;
        count++;
        System.out.println("User Added: " + userName);
    }

    void deleteUser(String userName) {
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (user[i] != null && user[i] == userName) {
                index = i;
                break;
            }
        }
        for (int i = index; i < count - 1; i++) {
            user[i] = user[i + 1];

        }
        user[--count] = null;

        System.out.println("User Deleted: " + userName);
    }

    public void performRole() {
        System.out.println("Total user: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        User[] u = new User[3];
        u[0] = new Student("ash@gmail.com", "Adeeb", "DLD", "3.76");
        u[1] = new Teacher("labbi@gmail.com", "Labib", "OOP");
        u[2] = new Administrator("mah@gmail.com", "Mahim", "Mahim11", "Mahim");
        ((Student) u[0]).enrollCourse("SOC");
        ((Student) u[0]).viewGrades();
        ((Teacher) u[1]).createCourse("MATH 1181");
        ((Administrator) u[2]).addUser("John");
        ((Administrator) u[2]).addUser("Mark");
        ((Administrator) u[2]).addUser("Alex");
        ((Administrator) u[2]).deleteUser("John");
        for (User user : u) {
            user.performRole();
        }

    }
}