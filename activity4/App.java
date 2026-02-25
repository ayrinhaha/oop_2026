import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // create list to store all accounts
        ArrayList<BankAccount> accounts = new ArrayList<>();

        // load accounts from CSV file into ArrayList
        loadAccounts(accounts);

        // login
        Scanner sc = new Scanner(System.in);

        Optional<BankAccount> newSessionUser = Optional.empty();
        // loop until a valid account is entered
        while (!newSessionUser.isPresent()) {
            System.out.println("WELCOME TO JAVA ATM");
            System.out.println("Enter account number to proceed:");
            String acctNo = sc.nextLine();

            // search for matching account number using stream
            newSessionUser = accounts.stream()
                    .filter(account -> account.getAcctNo().equals(acctNo))
                    .findFirst();

            if (!newSessionUser.isPresent()) {
                System.out.println("Account not found... try again.\n");
            }
        }

        // loop until correct PIN is entered
        boolean authenticated = false;
        while (!authenticated) {
            System.out.println("\nEnter PIN:");
            int pin = sc.nextInt();
            sc.nextLine();

            if (newSessionUser.get().isValidPin(pin)) {
                authenticated = true;
                System.out.println("Welcome " + newSessionUser.get().getFullName() + "!");
                // begin transaction session
                beginTransaction(newSessionUser.get(), accounts);
                System.out.println("Session ended.");
            } else {
                System.out.println("Invalid credentials... try again.");
            }
        }

        sc.close(); 
    }

    public static void beginTransaction(BankAccount account, ArrayList<BankAccount> accounts) {

        Scanner sc = new Scanner(System.in);
        int choice;

        // transaction loop (runs until user chooses 0)
        do {

            System.out.println("""
                        Menu
                        1. Balance Inquiry
                        2. Deposit
                        3. Withdraw
                        0. Exit
                    """);

            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    // display current balance
                    System.out.println("Current Balance: " + account.getBalance());
                    break;

                case 2:
                    // deposit money
                    System.out.print("Enter amount to deposit: ");
                    float depositAmt = sc.nextFloat();
                    sc.nextLine();

                    if (account.deposit(depositAmt)) {
                        System.out.println("Deposit successful.\nNew Balance: " + account.getBalance());

                        // save updated data to file
                        saveAccounts(accounts);
                    } else {
                        System.out.println("Deposit failed.");
                    }
                    break;

                case 3:
                    // withdraw money
                    System.out.print("Enter amount to withdraw: ");
                    float withdrawAmt = sc.nextFloat();
                    sc.nextLine();

                    if (account.withdraw(withdrawAmt)) {
                        System.out.println("Withdrawal successful.\nNew Balance: " + account.getBalance());

                        // save updated data to file
                        saveAccounts(accounts);
                    } else {
                        System.out.println("Withdrawal failed.");
                    }
                    break;

                case 0:
                    // exit transaction loop
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

    }

    public static void loadAccounts(ArrayList<BankAccount> accounts) {
        // read accounts from CSV file
        try (Scanner reader = new Scanner(new File("accounts.csv"))) {

            reader.nextLine(); // skip header row

            while (reader.hasNextLine()) {

                // split each line by comma
                String[] cols = reader.nextLine().split(",");

                String acctNo = cols[0];
                String fullName = cols[1];
                float balance = Float.parseFloat(cols[2]);
                int pin = Integer.parseInt(cols[3]);

                BankAccount acc = new BankAccount(acctNo, pin, balance, fullName);

                // add account to list
                accounts.add(acc);
            }

        } catch (FileNotFoundException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void saveAccounts(ArrayList<BankAccount> accounts) {

        // overwrite CSV file with updated account data
        try (java.io.PrintWriter writer = new java.io.PrintWriter("accounts.csv")) {

            writer.println("acctNo,fullName,balance,pin"); // write header

            for (BankAccount acc : accounts) {

                // write each account as CSV row
                writer.println(
                        acc.getAcctNo() + "," +
                                acc.getFullName() + "," +
                                acc.getBalance() + "," +
                                acc.getPin());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}