import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a bank
        Bank myBank = new Bank("MyBank");

        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input to create accounts
        System.out.println("Enter details to create an account:");
        System.out.print("Nomor reekening: ");
        String accountNumber1 = scanner.next();
        System.out.print("Nama rekening: ");
        String accountHolder1 = scanner.next();
        System.out.print("Jumlah setoran: ");
        double initialBalance1 = scanner.nextDouble();

        Account account1 = new Account(accountNumber1, accountHolder1, initialBalance1);
        myBank.addAccount(account1);


        // Display all accounts in the bank
        System.out.println("All accounts in " + myBank.getName() + ":");
        myBank.displayAllAccounts();

        // Perform transactions
        System.out.println("Enter account number for transactions:");
        String selectedAccountNumber = scanner.next();
        Account selectedAccount = myBank.findAccount(selectedAccountNumber);

        if (selectedAccount != null) {
            // Display account details
            System.out.println("Selected account details:");
            System.out.println(selectedAccount);

            // Perform transactions based on user input
            System.out.print("Enter deposit amount: ");
            double depositAmount = scanner.nextDouble();
            selectedAccount.deposit(depositAmount);



            // Display updated account details
            System.out.println("Updated account details:");
            System.out.println(selectedAccount);
        } else {
            System.out.println("Account not found");
        }

        // Close the scanner
        scanner.close();
    }
}
