import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //First set of assignments: Constructor practice
        //Constructor practice First exercise
        BankAccount account = new BankAccount(500,"Jacob Miller",0);
        account.deposit(100);
        account.getAccountInfo();
        //Constructor practice second exercise
        BankAccount account1 = new BankAccount(5000,"Richard",1);
        BankAccount account2 = new BankAccount(300,"Leo",2);
        account1.withdrawl(100);
        account2.deposit(100);
        account1.getAccountInfo();
        account2.getAccountInfo();
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

    }
}
