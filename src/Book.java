import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private String title;
    private int pages;
    private int year;
    public Book(String title, int pages, int year){
        this.pages = pages;
        this.title = title;
        this.year = year;
    }
    public Book(int pages, int year){
        this.pages = pages;
        this.year = year;
    }
    public Book(int year){
        this.year = year;
    }
    public Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }
    public Book(String title){
        this.title = title;
    }
    public Book(){
    }
    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "The books title is " + getTitle() + ", it has " + getPages() + " pages, and was published in "
                + getYear();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

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


    }
}
