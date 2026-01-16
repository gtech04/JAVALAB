
import java.util.Scanner;
class Company {
    protected String companyName;

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void companyName() {
        System.out.println("Company Name: " + companyName);
    }
}

class Employee1 extends Company {
    private String employeeName;

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void employeeName() {
        System.out.println("Employee1 Name: " + employeeName);
    }
}

class Employee2 extends Company {
    private String employeeName;

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void employeeName() {
        System.out.println("Employee2 Name: " + employeeName);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Company company = new Company();
        System.out.print("Enter the company name: ");
        String compName = scanner.nextLine();
        company.setCompanyName(compName);

        Employee1 emp1 = new Employee1();
        emp1.setCompanyName(compName); 
        System.out.print("Enter the name of Employee1: ");
        String emp1Name = scanner.nextLine();
        emp1.setEmployeeName(emp1Name);

        Employee2 emp2 = new Employee2();
        emp2.setCompanyName(compName); 
        System.out.print("Enter the name of Employee2: ");
        String emp2Name = scanner.nextLine();
        emp2.setEmployeeName(emp2Name);

        System.out.println("\nDisplaying details:");
        emp1.companyName();
        emp1.employeeName();

        emp2.companyName();
        emp2.employeeName();

    }
}

