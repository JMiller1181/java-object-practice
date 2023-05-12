import java.util.ArrayList;
import java.util.Scanner;

public class TvShow {
    private String name;
    private int episodes;
    private String genre;

    public String getName() {
        return name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getGenre() {
        return genre;
    }

    public TvShow (String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }
    public TvShow (String name, int episodes) {
        this.name = name;
        this.episodes = episodes;
    }
    public TvShow (String name) {
        this.name = name;
    }
    public TvShow (int episodes, String genre) {
        this.episodes = episodes;
        this.genre = genre;
    }
    public TvShow (int episodes) {
        this.episodes = episodes;
    }
    public TvShow (String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public TvShow () {
    }

    @Override public String toString() {
        return "The name of the show is " + getName() + ", there are " + getEpisodes() +
                " episodes, and the genre is " + getGenre();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
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

    }
}
