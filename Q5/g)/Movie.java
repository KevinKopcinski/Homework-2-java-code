import java.util.List;

public class Movie {

    private String name;
    private String genre;
    private List<Watch> listWatch;

    Movie(String name, String genre){
        this.name = name;
        this.genre = genre;
    }
}
