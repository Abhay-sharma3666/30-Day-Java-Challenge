
/* Problem 2 : To create a class called BankAccount with private instance variables
               accountNumber and balance. Provide public getter and setter methods
               to access and modify these variables.
*/
//  Solving :-->

// BankAccount.java
// BankAccount Class

class BankAccount2 {
    private String accountNumber;
    private double balance;
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}

public class Day_16_Encapsulation_2 {
    public static void main(String[] args) {
        // Create an instance of BankAccount
        BankAccount2 account = new BankAccount2();

        // Set values using setter methods
        account.setAccountNumber("SB-09876");
        account.setBalance(2000.0);

        // Get values using getter methods
        String accountNumber = account.getAccountNumber();
        double balance = account.getBalance();

        // Print the values
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
