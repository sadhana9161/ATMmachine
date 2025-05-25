import java.util.Scanner;

class ATM{
    float balance = 10000;
    int PIN = 12345 ;

    public void checkpin()
    {
        System.out.println("enter you pin...");
        Scanner sc = new Scanner(System.in);
        PIN = sc.nextInt();

        if(PIN == 12345){
            menu();
        }
        else{
            System.out.println("valid pin");
            menu();
        }
    }

    public void menu()
    {
        System.out.println("enter your choice..");
        System.out.println("1. Check blance:");
        System.out.println("2. Withdrow money:");
        System.out.println("3.Deposit money:");
        System.out.println("Exit");

        Scanner sc = new Scanner(System.in);
        int options = sc.nextInt();

        if(options == 1){
            checkblance();
        }
        else if(options == 2){
            withdrowMoney();
        }
        else if(options == 3){
            depositMoney();
        }
        else{
            System.out.println("enter a valid choice..");
        }

    }

    public void checkblance()
    {
        System.out.println("balance"+ balance);
        menu();
    }

    public void withdrowMoney()
    {
        System.out.println("enter amount to withdrow...");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>balance)
        {
            System.out.println("insufficient balance...");
        }
        else{
            balance = balance - amount;
            System.out.println("money withdrow successful");

        }
        menu();
    }

    public void depositMoney()
    {
        System.out.println("enter the amount...");
        Scanner sc =  new Scanner(System.in);
        float amount  = sc.nextFloat();
        balance = balance + amount;
        System.out.println("money deposti successful...");
        menu();
    }
}
public class ATMmachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
