public class BankAccount {
    private double balance;
    private String name;
    private int accountNumber;
//        public BankAccount(){
//            this.balance = balance;
//            this.name = name;
//        }
        public BankAccount(double balance, String name,int accountNumber){
            this.balance = balance;
            this.name = name;
            this.accountNumber = accountNumber;
        }
        public void deposit(double deposit){
            balance += deposit;
        }
        public void withdrawl(double withdrawl){
            balance -= withdrawl;
        }
        public void getAccountInfo(){
            System.out.println("The account holder is: " + name);
            System.out.println("The account balance is: " + balance);
        }

}
