import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // load accounts
        // BankAccount[] accounts;
        ArrayList<BankAccount> accounts = new ArrayList<>();
        loadAccounts(accounts);

        // login
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO JAVA ATM");
        System.out.println("Enter account number to proceed:");
        String acctNo = sc.nextLine();
        System.out.println("Enter PIN:");
        int pin = sc.nextInt();
        sc.nextLine(); 

        /* 
        CHECKING IF THE ACCOUNT IS PRESENT THEN AUTHENTICATE WITH THE PIN
        OPTION 1:
        for(BankAccount a: accounts){
            if(a.getAcctNo().equals(acctNo)){
                newSessionUser = a; //assign to new session user if match is found
                break;
            }
        } 
        //try if account exist then check PIN
        if(newSessionUser != null){
            if(newSessionUser.getPin() == pin){
                System.out.println("Welcome...");
                //begin transaction
                beginTransaction(newSessionUser);
            }else{
                System.out.println("Sorry try again...");
            }
        }else{
            System.out.println("Sorry try again...");
        }
        */

        /*
            public static boolean match(param){
                return property == param
            }
        */

        // OPTION 2
        Optional<BankAccount> newSessionUser = accounts.stream()
                .filter(account -> account.getAcctNo().equals(acctNo))
                .findFirst();

        if (newSessionUser.isPresent()) {
            if (newSessionUser.get().isValidPin(pin)) {
                System.out.println("Welcome " + newSessionUser.get().getFullName() + "!");
                // begin transaction
                beginTransaction(newSessionUser.get());
                System.out.println("Session ended.");
            } else {
                System.out.println("Invalid credentials...");
            }
        } else {
            System.out.println("Account not found...");
        }
    }

    public static void beginTransaction(BankAccount account) {
        System.out.println("""
                    Menu
                    1. Balance Inquiry
                    2. Deposit
                    3. Withdraw
                    0. Exit
                """);

        Scanner sc = new Scanner(System.in);
        System.out.print("Choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {
            case 1:
                // display current balance
                System.out.println("Current Balance: " + account.getBalance());
                break;
            case 2:
                // deposit amount
                System.out.print("Enter amount to deposit: ");
                float depositAmt = sc.nextFloat();
                sc.nextLine(); // <-- consume leftover newline
                if (account.deposit(depositAmt)) {
                    System.out.println("Deposit successful. New Balance: " + account.getBalance());
                } else {
                    System.out.println("Deposit failed.");
                }
                break;
            case 3:
                // withdraw amount
                System.out.print("Enter amount to withdraw: ");
                float withdrawAmt = sc.nextFloat();
                sc.nextLine(); 
                if (account.withdraw(withdrawAmt)) {
                    System.out.println("Withdrawal successful. New Balance: " + account.getBalance());
                } else {
                    System.out.println("Withdrawal failed.");
                }
                break;
            case 0:
                // exit session
                System.out.println("Exiting...");
                break;
            default:
                // invalid input
                System.out.println("Invalid choice.");
        }
    }

    public static void loadAccounts(ArrayList<BankAccount> accounts) {
        try (Scanner reader = new Scanner(new File("accounts.csv"))) {
            reader.nextLine(); // skip the header
            while (reader.hasNextLine()) {
                String[] cols = reader.nextLine().split(",");
                String acctNo = cols[0];
                String fullName = cols[1];
                float balance = Float.parseFloat(cols[2]);
                int pin = Integer.parseInt(cols[3]);

                BankAccount acc = new BankAccount(acctNo, pin, balance, fullName);
                accounts.add(acc);
            }
        } catch (FileNotFoundException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
