import java.util.Scanner;

abstract class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

   
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into Savings Account. New balance: " + balance);
    }

    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Savings Account. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(double balance) {
        super(balance);
    }

    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into Current Account. New balance: " + balance);
    }

    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from Current Account. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance in Current Account.");
        }
    }
}

public class keywords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance for Savings Account: ");
        double savingsBalance = scanner.nextDouble();

        System.out.print("Enter initial balance for Current Account: ");
        double currentBalance = scanner.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(savingsBalance);
        CurrentAccount currentAccount = new CurrentAccount(currentBalance);

        while (true) {
            System.out.println("\n1. Deposit into Savings Account");
            System.out.println("2. Withdraw from Savings Account");
            System.out.println("3. Deposit into Current Account");
            System.out.println("4. Withdraw from Current Account");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit into Savings Account: ");
                    double savingsDeposit = scanner.nextDouble();
                    savingsAccount.deposit(savingsDeposit);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw from Savings Account: ");
                    double savingsWithdraw = scanner.nextDouble();
                    savingsAccount.withdraw(savingsWithdraw);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit into Current Account: ");
                    double currentDeposit = scanner.nextDouble();
                    currentAccount.deposit(currentDeposit);
                    break;
                case 4:
                    System.out.print("Enter amount to withdraw from Current Account: ");
                    double currentWithdraw = scanner.nextDouble();
                    currentAccount.withdraw(currentWithdraw);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}
