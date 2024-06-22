
/* Problem 4 : Create an abstract class “BankAccount” with abstract methods “deposit()” and “withdraw()”.
               Implement two subclasses “SavingsAccount” and “CheckingAccount” which extend “BankAccount” and
               implement the abstract methods. Create a “Customer” class which contains a list of “BankAccount” objects.
               Add methods to the “Customer” class to display account balances, deposit/withdraw money, etc. Create
               objects of all classes and test their behavior.
 */
abstract class BankAccounts {
    protected double balance;
    public BankAccounts(double balance) {
        this.balance = balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
class SavingsAccount2 extends BankAccounts {
    public SavingsAccount2(double balance) {
        super(balance);
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
class CheckingAccount1 extends BankAccounts {
    public CheckingAccount1(double balance) {
        super(balance);
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        double fee = 0.1 * amount;
        if (balance >= amount + fee) {
            balance -= amount + fee;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
class Customer {
    private BankAccounts account;
    public Customer(BankAccounts account) {
        this.account = account;
    }
    public void displayBalance() {
        System.out.println("Current balance: " + account.balance);
    }
    public void deposit(double amount) {
        account.deposit(amount);
    }
    public void withdraw(double amount) {
        account.withdraw(amount);
    }
}
public class Day_17_Abstract_class_4 {
    public static void main(String[] args) {
        BankAccounts account = new CheckingAccount1(1000.0);
        Customer customer = new Customer(account);
        customer.displayBalance();
        customer.deposit(500.0);
        customer.displayBalance();
        customer.withdraw(200.0);
        customer.displayBalance();
        customer.withdraw(1500.0); // Should print "Insufficient funds"
    }
}
