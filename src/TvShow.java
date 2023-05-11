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

    @Override public String toString() {
        return "The name of the show is " + getName() + ", there are " + getEpisodes() +
                " episodes, and the genre is " + getGenre();
    }
}
