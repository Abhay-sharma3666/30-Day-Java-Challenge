/* Program 6 : To create a base class BankAccount with methods deposit()
               and withdraw(). Create two subclasses SavingsAccount and
               CheckingAccount. Override the withdraw() method in each
               subclass to impose different withdrawal limits and fees.

 */
//BankAccount.java
class BankAccount1 {
    private double balance;

    public BankAccount1(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
//SavingsAccount.java

class SavingsAccount1 extends BankAccount1 {
    private double withdrawalLimit;

    public SavingsAccount1(double initialBalance, double withdrawalLimit) {
        super(initialBalance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= withdrawalLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal limit exceeded.");
        }
    }
}
//CheckingAccount.java
class CheckingAccount extends BankAccount1 {
    private double overdraftFee;

    public CheckingAccount(double initialBalance, double overdraftFee) {
        super(initialBalance);
        this.overdraftFee = overdraftFee;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else {
            System.out.println("Overdraft fee applied.");
            super.withdraw(amount + overdraftFee);
        }
    }
}
//Main.java
public class Day_15_Polymorphism_6 {
    public static void main(String[] args) {
        BankAccount1 savingsAccount = new SavingsAccount1(2000, 650);
        BankAccount1 checkingAccount = new CheckingAccount(1000, 100);

        withdrawFromAccount(savingsAccount, 300);
        withdrawFromAccount(checkingAccount, 250);

        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: " + checkingAccount.getBalance());
    }

    public static void withdrawFromAccount(BankAccount1 account, double amount) {
        account.withdraw(amount);
    }
}

