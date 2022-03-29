package Command;

import Data.Movie;
import utility.MovieFactory;

import java.util.LinkedHashSet;

public class AddIfMaxCommand extends CommandAbstract{

    MovieFactory movieFactory;

    public AddIfMaxCommand(String name, String description, MovieFactory movieFactory) {
        super(name, description);
        this.movieFactory = movieFactory;
    }

    public void execute(String arg, LinkedHashSet<Movie> collectionForWork) {
        Movie movieForAdd = movieFactory.GetMovieFromConsole();
        int oscarsCountFromUser = movieForAdd.getOscarsCount();
        int maxOscarsCount = 0;
        for (Movie movie : collectionForWork){
            if (movie.getOscarsCount() > maxOscarsCount){
                maxOscarsCount = movie.getOscarsCount();
            }
        }
        if(oscarsCountFromUser > maxOscarsCount) {
            collectionForWork.add(movieForAdd);
        }
        else{
            System.out.println("Таких элементов нет");
        }
    }
}
