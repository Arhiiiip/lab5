package Command;

import Data.Movie;
import utility.MovieFactory;

import java.util.LinkedHashSet;

public class AddCommand extends CommandAbstract{
    MovieFactory movieFactory;


    public AddCommand(String name, String description, MovieFactory movieFactory) {
        super(name, description);
        this.movieFactory = movieFactory;
    }

    @Override
    public void execute(String arg, LinkedHashSet<Movie> collectionForWork) {
        Movie movie = movieFactory.GetMovieFromConsole();
        collectionForWork.add(movie);
    }
}
