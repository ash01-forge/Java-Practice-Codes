public class Employee {
    String name;
    String jobTitle;
    double salary;

    Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    double calculateSalary(double salary) {
        return salary * 12;
    }

    double updateSalary(double per) {
        salary= (salary + (salary * per / 100.00));
        return salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println("Yearly Salary: " + calculateSalary(salary));
    }
    public static void main(String[] args) {
        System.out.println("Salary before updating:");
        Employee E1=new Employee("Adeeb Sharar","HR Manager",18500.8798);
        E1.display();
        System.out.println("-----------------------------------------");
        System.out.println("Salary after updating:");
        E1.calculateSalary(E1.updateSalary(12));
        E1.display();



    }
}


