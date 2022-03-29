package Command;

import Data.Movie;
import utility.MovieFactory;

import java.util.LinkedHashSet;

public class AddIfMinCommand extends CommandAbstract{

    MovieFactory movieFactory;

    public AddIfMinCommand(String name, String description, MovieFactory movieFactory) {
        super(name, description);
        this.movieFactory = movieFactory;
    }

    public void execute(String arg, LinkedHashSet<Movie> collectionForWork) {
        Movie movieForAdd = movieFactory.GetMovieFromConsole();
        int oscarsCountFromUser = movieForAdd.getOscarsCount();
        int minOscarsCount = (int) Math.pow(2,32);
        for (Movie movie : collectionForWork){
            if (movie.getOscarsCount() < minOscarsCount){
                minOscarsCount = movie.getOscarsCount();
            }
        }
        if(oscarsCountFromUser < minOscarsCount) {
            collectionForWork.add(movieForAdd);
        }
        else{
            System.out.println("Таких элементов нет");
        }    }
}
