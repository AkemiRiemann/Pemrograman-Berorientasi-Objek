package Pertemuan03.Penugasan.Exception;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        double amount;
        char exit = 'Y';
        int menu;

        while (run){
            System.out.println("=============== Welcome to Yuki Bank ===============");
            System.out.println("Choose Transaction");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("===================================================");
            System.out.print("Input Your Choice: ");
            try {
                menu = scanner.nextInt();
            }
            catch (Exception ex){
                menu = 4;
            }
            finally {
                scanner.nextLine();
            }
            switch (menu) {
                case 1:
                    System.out.println("Your Balance is $" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the Balance to Deposit: $");
                    try {
                        amount = scanner.nextDouble();
                        scanner.nextLine();
                        account.deposit(amount);
                    }
                    catch (InvalidAmountException ex){
                        System.out.println(ex.getMessage());
                    }
                    catch (Exception ex){
                        System.out.println("Invalid Input");
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Enter the Balance to Withdraw: $");
                        amount = scanner.nextDouble();
                        scanner.nextLine();
                        account.withdraw(amount);
                    }
                    catch (InvalidAmountException | InsufficientFundsException ex){
                        System.out.println(ex.getMessage());
                    }
                    catch (Exception ex){
                        System.out.println("Invalid Input");
                    }
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
            if (1 <= menu && menu <= 3){
                System.out.println("===================================================");
                System.out.print("Want To Continue? [Y/n]: ");
                exit = scanner.nextLine().charAt(0);
            }
            if (exit == 'n') {
                run = false;
            }
        }

        scanner.close();
    }
  }
  