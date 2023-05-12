import java.util.Scanner;
import java.util.ArrayList;
public class Main {
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

        //Constructor practice third exercise
        Product apple = new Product("Apple", 1.05, 12);
        apple.printProduct();
        apple.totalCost();

        //Second set of assignments: Objects in lists
        //Objects in lists First exercise
        ArrayList<Animal> animals = new ArrayList<>();
        while(true){
            System.out.println("Please enter a name: ");
            String animalName = scanner.nextLine();
            boolean isDog;
            if(animalName.equals("")){
                break;
            } else {
                System.out.println("Is it a dog? Yes or No?");
                String dog = scanner.nextLine();
                if (dog.equalsIgnoreCase("yes")) {
                    isDog = true;
                } else {
                    isDog = false;
                }
            }
            animals.add(new Animal(animalName,isDog));
        }
        for(Animal entry: animals){
            System.out.println(entry.toString());
        }

        //Objects in lists Second exercise
        ArrayList<TvShow> shows = new ArrayList<>();
        while(true){
            System.out.println("Name of the show: ");
            String showName;
            int eps;
            String genre;
            showName = scanner.nextLine();
            if(showName.equals("")){
                break;
            } else {
                System.out.println("How many episodes?");
                eps = scanner.nextInt();
                scanner.nextLine();
                System.out.println("What is the genre of the show?");
                genre = scanner.nextLine();
                }
            shows.add(new TvShow(showName,eps,genre));
        }
        for(TvShow entry: shows){
            System.out.println(entry.toString());
        }

        //Objects in lists Third exercise
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Dictionary of Geology",301,2001));
        books.add(new Book("John Dies at the End",496,2007));
        books.add((new Book("Devolution",304,2020)));
        while(true){
            System.out.println("Name of the book: ");
            String bookName;
            int pages;
            int published;
            bookName = scanner.nextLine();
            if(bookName.equals("")){
                break;
            } else {
                System.out.println("How many pages?");
                pages = scanner.nextInt();
                scanner.nextLine();
                System.out.println("What year was the book published?");
                published = scanner.nextInt();
                scanner.nextLine();
            }
            books.add(new Book(bookName,pages,published));
        }
        System.out.println("What information will be printed?");
        String printed = scanner.nextLine();
        if (printed.equalsIgnoreCase("everything")){
            for(Book entry: books){
                System.out.println(entry.toString());
            }
        } else if (printed.equalsIgnoreCase("name")) {
            for (Book entry: books){
                System.out.println(entry.getTitle());
            }
        }

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

        //Overloading practice
        //Overloading practice first exercise

        Book titlePages = new Book("Book with pages", 123);
        Book title = new Book("Book with title");
        Book pagesYears = new Book(123, 2023);
        Book bookYear = new Book(2023);
        Book emptyBook = new Book();

        TvShow showRun = new TvShow("That TV Show", 20);
        TvShow epsGenre = new TvShow(30, "Comedy");
        TvShow eps = new TvShow(15);
        TvShow titleGenre = new TvShow("Another TV show", "Drama");
        TvShow emptyV = new TvShow();

        Animal animalName = new Animal("Kevin Bacon");
        Animal noName = new Animal(false);
        Animal nothing = new Animal();

        //Overloading practice second exercise
        Counter zeroStart = new Counter();
        System.out.println(zeroStart.value());
        zeroStart.increase();
        System.out.println(zeroStart.value());
        zeroStart.decrease();
        System.out.println(zeroStart.value());
        Counter counter = new Counter(4);
        System.out.println(counter.value());
        counter.decrease(2);
        System.out.println(counter.value());
        counter.increase(4);
        System.out.println(counter.value());
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
