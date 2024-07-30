class Student {
//Implement a Java program to create a class Student with data ‘name, city and age’ along with the
//  method printData to display the data. Create the two objects s1 ,s2 to  declare and access the 
//  values.
    String name , city;
    Integer age;

    public void  P1(String name , String city , Integer age){
        this.age = age;
        this.city = city;
        this.name = name;
    }

    public void  PrintData(){
        System.out.println("Student Name is : "+name);
        System.out.println("Student Age is : "+age);
        System.out.println("Student city is : "+city);
    }
}
public class P1_2{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.P1("YAsh", "Rajkot", 19);
        s2.P1("Mitanshu", "Rajkot", 19);


        System.out.println("Student 1: ");
        s1.PrintData();

        System.out.println("\nStudent 2: ");
        s2.PrintData();

    }
}