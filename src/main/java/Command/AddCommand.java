package Command;

import Data.Movie;
import utility.MovieFactory;

public class AddCommand extends CommandAbstract {

    MovieFactory movieFactory;



    public AddCommand(String name, String description, MovieFactory movieFactory, boolean isArgument) {
        super(name, description, isArgument);
        this.movieFactory = movieFactory;
    }

    @Override
    public void execute(String arg) {
        Movie movie = movieFactory.GetMovieFromConsole();
        movieFactory.getCollectionForWork().add(movie);
        movieFactory.getCollectionManager().setDateUpdate();
    }
}
