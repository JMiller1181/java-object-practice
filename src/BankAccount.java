import java.util.Scanner;
public class BankAccount {
    private double balance;
    private String name;
    private int accountNumber;
        public BankAccount(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("What is your name: ");
            name = scanner.nextLine();
            System.out.print("What is the starting balance: ");
            balance = scanner.nextDouble();        }
        public BankAccount(double balance, String name,int accountNumber){
            this.balance = balance;
            this.name = name;
            this.accountNumber = accountNumber;
        }
        public void deposit(double deposit){
            balance += deposit;
        }
        public void withdrawal(double withdrawal){
            balance -= withdrawal;
        }
        @Override public String toString(){
            return "The account holder is: " + name + "\n" +
                    "The account balance is: " + balance + "\n" +
                    "The account number is: " + accountNumber;
        }
        public int getAccountNumber() {
        return accountNumber;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }
        public String getName() {
            return name;
        }
        public double getBalance() {
            return balance;
        }
        public void transfer(BankAccount account, double transferAmount) {
            balance -= transferAmount;
            account.deposit(transferAmount);
        }
}
