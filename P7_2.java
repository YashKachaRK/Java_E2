import java.util.Scanner; // Import the Scanner class for input

// Define the Employee class
class Employee {
    // Private attributes
    private String name;
    private int age;
    private String address;
    private String mobileNumber;
    private double salary;

    
    public Employee(String name, int age, String address, String mobileNumber, double salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.salary = salary;
    }

  
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Salary: " + salary);
    }


    public double getSalary() {
        return salary;
    }
}



public class P7_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEmployees;

       
        System.out.print("Enter the number of employees: ");
        numEmployees = scanner.nextInt();
        scanner.nextLine(); 

        Employee[] employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Mobile Number: ");
            String mobileNumber = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 


            employees[i] = new Employee(name, age, address, mobileNumber, salary);
        }
        Employee highestPaid = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > highestPaid.getSalary()) {
                highestPaid = employees[i];
            }
        }

        System.out.println("\nEmployee with the highest salary:");
        highestPaid.displayDetails();

    }    
}
