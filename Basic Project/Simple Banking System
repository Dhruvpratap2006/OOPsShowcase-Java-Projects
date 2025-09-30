import java.util.Scanner;

class Bank {
    private double balance;
    private int pin;

    // Constructor
    Bank(double balance, int pin) {
        if (balance < 0) {
            System.out.println("Invalid Balance. Setting to 0");
            this.balance = 0;
        } else {
            this.balance = balance;
        }
        this.pin = pin;
    }

    // Method to authenticate PIN
    private boolean authenticatePin(int enteredPin) {
        return this.pin == enteredPin;
    }

    // Deposit money
    public void depositMoney(double amount, int enteredPin) {
        if (!authenticatePin(enteredPin)) {
            System.out.println("❌ Wrong PIN Entered!");
            return;
        }
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposited: " + amount);
        } else {
            System.out.println("❌ Invalid deposit amount.");
        }
    }

    // Withdraw money
    public void withdrawalMoney(double amount, int enteredPin) {
        if (!authenticatePin(enteredPin)) {
            System.out.println("❌ Wrong PIN Entered!");
            return;
        }
        if (amount <= 0) {
            System.out.println("❌ Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("❌ Insufficient funds.");
        } else {
            balance -= amount;
            System.out.println("✅ Withdrawn: " + amount);
        }
    }

    // Balance check method
    public void checkBalance(int enteredPin) {
        if (!authenticatePin(enteredPin)) {
            System.out.println("❌ Authentication failed. Wrong PIN!");
            return;
        }
        System.out.println("💰 Current Balance: " + balance);
    }
}

public class BANK_ACCOUNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create account with initial balance + PIN
        Bank account = new Bank(5000, 1234);

        while (true) {
            System.out.println("\n========= BANK MENU =========");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("E. Exit");
            System.out.print("Choose an option: ");
            String choice = sc.next(); // take string (can be number or 'E')

            switch (choice) {
                case "1":
                    System.out.print("Enter PIN: ");
                    int pin1 = sc.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    account.depositMoney(deposit, pin1);
                    break;

                case "2":
                    System.out.print("Enter PIN: ");
                    int pin2 = sc.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    account.withdrawalMoney(withdraw, pin2);
                    break;

                case "3":
                    System.out.print("Enter PIN: ");
                    int pin3 = sc.nextInt();
                    account.checkBalance(pin3);
                    break;

                case "E":
                case "e":
                    System.out.println("✅ Thank you for using our Bank. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Invalid option! Please try again.");
            }
        }
    }
}

