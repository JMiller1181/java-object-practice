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
}
