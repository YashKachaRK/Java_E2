import java.util.Scanner;


class Person {

    private int age;
    private String name;
    private String address;
    private String mobileNumber;


    public void getInput() {
        Scanner scanner = new Scanner(System.in); 

     
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        
        System.out.print("Enter age: ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter address: ");
        address = scanner.nextLine();
        
        System.out.print("Enter mobile number: ");
        mobileNumber = scanner.nextLine();
    }

  
    public void show() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + mobileNumber);
    }
}


public class P6_2 {
    public static void main(String[] args) {
      
        Person person = new Person();

    
        person.getInput();

        
        person.show();
    }
}
