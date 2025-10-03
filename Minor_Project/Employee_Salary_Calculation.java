// Base Class
abstract class Employee {
    String name;
    int jobId;

    Employee(String name, int jobId) {
        this.name = name;
        this.jobId = jobId;
    }

    // Abstract method (force subclasses to implement)
    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Employee Name: " + name + " , Job Id: " + jobId);
    }
}

// Full-Time Employee
class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, int jobId, double monthlySalary) {
        super(name, jobId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Part-Time Employee
class PartTimeEmployee extends Employee {
    int hoursWorked;
    double ratePerHour;

    PartTimeEmployee(String name, int jobId, int hoursWorked, double ratePerHour) {
        super(name, jobId);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}

// Driver Class
public class EmployeeSalaryCalculation {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Dhruv", 1, 120000);
        Employee e2 = new PartTimeEmployee("Ram", 2, 29, 250);

        e1.displayInfo();
        System.out.println("Salary : " + e1.calculateSalary());

        e2.displayInfo();
        System.out.println("Salary : " + e2.calculateSalary());
    }
}
