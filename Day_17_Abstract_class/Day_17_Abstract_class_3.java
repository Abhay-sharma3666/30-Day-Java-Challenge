

/* Problem 3 : Create an abstract class “Account” with abstract method “calculateInterest()”. Implement two
               subclasses “SavingsAccount” and “CurrentAccount” which extend “Account” and implement the
               “calculateInterest()” method. Create objects of both classes and test their behavior.
 */
abstract class Account {
    protected double balance;
    public Account(double balance) {
        this.balance = balance;
    }
    public abstract double calculateInterest();
}
class SavingsAccount3 extends Account {
    public SavingsAccount3 (double balance) {
        super(balance);
    }
    public double calculateInterest() {
        double interest = balance * 0.05; // 5% interest rate
        balance += interest;
        return interest;
    }
}
class CurrentAccount extends Account {
    public CurrentAccount(double balance) {
        super(balance);
    }
    public double calculateInterest() {
        // Current account doesn't have interest
        return 0.0;
    }
}
public class Day_17_Abstract_class_3 {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount3(1000.0);
        Account currentAccount = new CurrentAccount(2000.0);
        // Print initial balance
        System.out.println("Savings Account Balance: " + savingsAccount.balance);
        System.out.println("Current Account Balance: " + currentAccount.balance);
        // Calculate interest and print balance
        double savingsInterest = savingsAccount.calculateInterest();
        double currentInterest = currentAccount.calculateInterest();
        System.out.println("Savings Account Balance after interest: " + savingsAccount.balance);
        System.out.println("Interest earned on Savings Account: " + savingsInterest);
        System.out.println("Current Account Balance after interest: " + currentAccount.balance);
        System.out.println("Interest earned on Current Account: " + currentInterest);
    }
}
