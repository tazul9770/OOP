//Bank account
public class AbstractDemo3 {
    public static void main(String[] args) {
        double ibal, damt, wamt;
        ibal = 1000.00;
        SavingsAccount sa = new SavingsAccount("tazul009", ibal);
        System.out.println("Saving A/c: Initial Balance: " +ibal);
        damt = 500.00;
        sa.deposit(damt);
        wamt = 250.00;
        sa.withdraw(wamt);
        wamt = 1600.00;
        System.out.println("\nTry to withdraw: " +wamt);
        sa.withdraw(wamt);

        System.out.println();
        ibal = 5000.00;
        CurrentAccount cr = new CurrentAccount("shopna55", ibal);
        System.out.println("Current A/c: Initial Balance: " +ibal);
        damt = 2500.00;
        cr.deposit(1000.0);
        wamt = 1250.00;
        cr.withdraw(3000.0);
        wamt = 6000.00;
        System.out.println("\nTry to withdraw: " +wamt);
        sa.withdraw(wamt);
    }
}
abstract class BankAccount {

    private String accountNum;
    private double balance;

    public BankAccount(String accountNum, double balance) {
        this.accountNum = accountNum;
        this.balance = balance;
    }
    public String getAccountNum() {
        return accountNum;
    }
    public double getBalance() {
        return balance;
    }
    protected void setBalance(double balance) {
        this.balance = balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount); 
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNum, double balance) {
        super(accountNum, balance);
    }
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" +amount+" sucessfull. Current balance: $" +getBalance());
    } 
    public void withdraw(double amount) {
        if(getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw of $" +amount+" sucessfull. Current balance: $" +getBalance());

        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}
class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNum, double balance) {
        super(accountNum, balance);
    }
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" +amount+" sucessfull. Current balance: $" +getBalance());
    }  
    public void withdraw(double amount) {
        if(getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw of $" +amount+" sucessfull. Current balance: $" +getBalance());

        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
}
}