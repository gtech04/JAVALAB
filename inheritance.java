//set 5
import java.util.Scanner;
// Superclass
class Company {
    protected String companyName;

    // Method to set and display the company name
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void companyName() {
        System.out.println("Company Name: " + companyName);
    }
}

// Subclass 1
class Employee1 extends Company {
    private String employeeName;

    // Method to set and display the name of Employee1
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void employeeName() {
        System.out.println("Employee1 Name: " + employeeName);
    }
}

// Subclass 2
class Employee2 extends Company {
    private String employeeName;

    // Method to set and display the name of Employee2
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void employeeName() {
        System.out.println("Employee2 Name: " + employeeName);
    }
}

// Main class to test the inheritance with user input
public class inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of Company to set the company name
        Company company = new Company();
        System.out.print("Enter the company name: ");
        String compName = scanner.nextLine();
        company.setCompanyName(compName);

        // Create an instance of Employee1 and set the employee name
        Employee1 emp1 = new Employee1();
        emp1.setCompanyName(compName); // Inherit company name
        System.out.print("Enter the name of Employee1: ");
        String emp1Name = scanner.nextLine();
        emp1.setEmployeeName(emp1Name);

        // Create an instance of Employee2 and set the employee name
        Employee2 emp2 = new Employee2();
        emp2.setCompanyName(compName); // Inherit company name
        System.out.print("Enter the name of Employee2: ");
        String emp2Name = scanner.nextLine();
        emp2.setEmployeeName(emp2Name);

        // Display results
        System.out.println("\nDisplaying details:");
        emp1.companyName();
        emp1.employeeName();

        emp2.companyName();
        emp2.employeeName();

    }
}
