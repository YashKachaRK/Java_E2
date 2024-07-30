import java.util.Scanner;

class Employee {
    String e_id, e_name ;
    Integer e_salary ,e_age ;
    
    public void  E_details (String e_id,String e_name , Integer e_salary , Integer e_age){
        this.e_id = e_id;
        this.e_name= e_name;
        this.e_salary = e_salary;
        this.e_age = e_age;

    }


       

    public void printData(){
        System.out.println("Employee Id: "+e_id);
        System.out.println("Employee Name: "+e_name);
        System.out.println("Employee Age: "+e_age);
        System.out.println("Employee Salary: "+e_salary);
    }
}
public class P2_2 {

    public static void main(String[] args) {



        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Id: ");
        String e_id = sc.nextLine();
        System.out.println("Enter Employee name: ");
        String e_name = sc.nextLine();
        System.out.println("Enter Employee Age: ");
        Integer e_age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Employee salary: ");
        Integer e_salary = Integer.parseInt(sc.nextLine());

        System.out.println("\nEmployee Details: ");

        employee.E_details(e_id, e_name, e_salary, e_age);
        employee.printData();

    }


}