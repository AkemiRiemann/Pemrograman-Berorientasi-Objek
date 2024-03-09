package Pertemuan03.Penugasan.Exception;

public class BankAccount {
    private double balance;
    private final double MIN_BALANCE = 100.0; // Saldo minimal
  
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
  
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0){
            throw new InvalidAmountException();
        }
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
  
    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0){
            throw new InvalidAmountException();
        }
        if (balance - amount < MIN_BALANCE) {
            throw new InsufficientFundsException("Insufficient Funds. Minimum balance required: $" + MIN_BALANCE);
        }
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
    }
  
    public double getBalance() {
        return balance;
    }
  }
  