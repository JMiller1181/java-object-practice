public class Main {
    public static void main(String[] args){
        //First exercise
        BankAccount account = new BankAccount(500,"Jacob Miller");
        account.deposit(100);
        account.getAccountInfo();
        //second exercise
        BankAccount account1 = new BankAccount(5000,"Richard");
        BankAccount account2 = new BankAccount(300,"Leo");
        account1.withdrawl(100);
        account2.deposit(100);
        account1.getAccountInfo();
        account2.getAccountInfo();
        //third exercise
        Product apple = new Product("Apple", 1.05, 12);
        apple.printProduct();
        apple.totalCost();
    }
}
