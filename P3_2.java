import java.util.Scanner;



class Bank{
    String Acc_no , Name  ,Type_Acc ;
    Double Balance = 0.0;

    public void getData(String Acc_no , String Name , String Type_Acc){
        this.Acc_no = Acc_no;
        this.Name = Name ;
        this.Type_Acc= Type_Acc;
    }

    //Display Balanace 
    public void Display_balance(){
        Balance = 0.0;
    }
    //Add balance
    // public void Add_balance(){
    //     Scanner sc  = new Scanner(System.in);

    //     System.out.print("ENTER AMOUNT YOU CAN ADD BALANCE IN YOU ACCOUNT: ");
    //     Balance = sc.nextDouble();
    //     System.out.println("Your Current balance");
    // }

    //Withdraw
    public void Withdraw (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Withdraw Amount: ");
        int withdraw;
        withdraw = sc.nextInt();
        if (withdraw <= Balance){
            Balance = Balance - withdraw;
            System.out.println("Your Withdraw Amount: "+withdraw);
            System.out.println("Your Current Balance: "+Balance);

        }else{
            System.out.println("You don't have enough balance");
        }
    }

    public void Deposit(){
        Scanner sc = new Scanner(System.in);
        int amount ;
        System.out.print("Enter Amount You Want To Add Balance : ");
        amount = sc.nextInt();
        
        Balance = amount + Balance;

        System.out.println("You Current Balance Is: "+Balance);

    }

    public void printInfo(){
        System.out.println("\n\nYour Name Is : "+Name);
        System.out.println("Your Acc_no Is : "+Acc_no);
        System.out.println("Your Acc_Type Is : "+Type_Acc);
        System.out.println("Your Balance Is : "+Balance );
        System.out.println();
    }

    public void checkBalance(){
        System.out.println("Your Balance is :"+Balance);
    }

    public void step(){
        System.out.println("Choice 1: Check Balance");
        System.out.println("Choice 2: Withdraw Amount");
        System.out.println("Choice 3: Deposit Amount");
        System.out.println("Choice 4: Show Your Info");
        System.out.println("Choice 5: Exit\n");
    }

}
public class P3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Your Acc_No : ");
        String Acc_no = sc.nextLine();

        System.out.print("Enter Your Acc_Type : ");
        String Acc_Type = sc.nextLine();

        Bank b = new Bank();
        b.getData(Acc_no, name, Acc_Type);
        b.printInfo();

        int choice ;
 

        while (true) {
            b.step();
            System.out.print("Emter Choice : ");
            choice = sc.nextInt();
            if(choice == 1){
                b.checkBalance();
            }
            else if (choice == 2) {
                b.Withdraw();
            }
            else if(choice == 3){
                b.Deposit();
            }
            else if(choice == 4){
                b.printInfo();
            }
            else if(choice  == 5){
                break;
            }
            else {
                System.out.println("Error : Invalid Choice!!");
            }
        }



    }
}
