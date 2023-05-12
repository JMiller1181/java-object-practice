import java.util.ArrayList;
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
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            //First set of assignments: Constructor practice
            //Constructor practice First exercise

            BankAccount account = new BankAccount(500,"Jacob Miller",0);
            account.deposit(100);
            System.out.println(account);

            //Constructor practice second exercise
            BankAccount account1 = new BankAccount(5000,"Richard",1);
            BankAccount account2 = new BankAccount(300,"Leo",2);
            account1.withdrawal(100);
            account2.deposit(100);
            System.out.println(account1);
            System.out.println(account2);

            //Bank Accounts Cont.
            //Bank Accounts Cont. First exercise
            ArrayList<BankAccount> accountList = new ArrayList<>();
            accountList.add(account);
            accountList.add(account1);
            accountList.add(account2);
            System.out.println("""
                Hello, welcome to the bank
                Are you a returning customer?
                1) Yes
                2) No""");
            int option = scanner.nextInt();
            if (option == 1){
                System.out.println("Please enter your account number");
                int userAccount = scanner.nextInt();
                for (BankAccount accounts: accountList) {
                    if (userAccount == accounts.getAccountNumber()) {
                        System.out.println(accounts);
                        mainMenu(accounts, accountList);
                    }
                }
            } else if (option == 2) {
                System.out.println("Thank you fo doing business with us!");
                BankAccount newUser = new BankAccount();
                newUser.setAccountNumber(accountList.size());
                accountList.add(newUser);
                System.out.println(newUser);
                mainMenu(newUser, accountList);
            } else {
                System.out.println("That is not a valid option. Goodbye.");
            }
        }

    //Bank Accounts Cont. second and third exercise
    public static void mainMenu(BankAccount currentAccount, ArrayList<BankAccount> accountList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, " + currentAccount.getName() + "\n" +
                "What would you like to do today?\n" +
                "1) Check account balance\n" +
                "2) Make a withdrawal\n" +
                "3) Make a deposit\n" +
                "4) Make a transfer\n" +
                "0) Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println("Your current account balance is " + currentAccount.getBalance());
            case 2 -> {
                System.out.println("Please enter the amount you would like to withdraw");
                double withdrawalAmount = scanner.nextDouble();
                currentAccount.withdrawal(withdrawalAmount);
                System.out.println("Your account balance is now " + currentAccount.getBalance());
            }
            case 3 -> {
                System.out.println("Please enter the amount you would like to deposit");
                double depositAmount = scanner.nextDouble();
                currentAccount.deposit(depositAmount);
                System.out.println("Your account balance is now " + currentAccount.getBalance());
            }
            case 4 -> {
                System.out.println("Please enter the amount you would like to transfer");
                double transferAmount = scanner.nextDouble();
                System.out.println("Please enter the account number you would like to transfer to");
                int transferTarget = scanner.nextInt();
                for (BankAccount accounts: accountList) {
                    if (transferTarget == accounts.getAccountNumber()) {
                        currentAccount.transfer(accounts, transferAmount);
                        System.out.println("The current account balances are now:\n" +
                                currentAccount.getBalance() + " in your account\n" +
                                accounts.getBalance() + " in the target account");
                    }
                }

            }
            case 0 -> System.out.println("Goodbye, " + currentAccount.getName());
        }
    }
}
