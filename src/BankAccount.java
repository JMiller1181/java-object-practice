public class BankAccount {
    private double balance;
    private String name;
        public BankAccount(double balance, String name){
            this.balance = balance;
            this.name = name;
        }
        public void deposit(double deposit){
            this.balance += deposit;
        }
        public void withdrawl(double withdrawl){
            this.balance -= withdrawl;
        }
        public void getAccountInfo(){
            System.out.println("The account holder is: " + this.name);
            System.out.println("The account balance is: " + this.balance);
        }

}
