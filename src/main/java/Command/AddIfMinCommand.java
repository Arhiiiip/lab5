package Command;

import Data.Movie;
import utility.MovieFactory;

public class AddIfMinCommand extends CommandAbstract {

    MovieFactory movieFactory;

    public AddIfMinCommand(String name, String description, MovieFactory movieFactory) {
        super(name, description);
        this.movieFactory = movieFactory;
    }

    public void execute(String arg) {
        Movie movieForAdd = movieFactory.GetMovieFromConsole();
        int oscarsCountFromUser = movieForAdd.getOscarsCount();
        int minOscarsCount = (int) Math.pow(2, 32);
        for (Movie movie : movieFactory.getCollectionForWork()) {
            if (movie.getOscarsCount() < minOscarsCount) {
                minOscarsCount = movie.getOscarsCount();
            }
        }
        if (oscarsCountFromUser < minOscarsCount) {
            movieFactory.getCollectionForWork().add(movieForAdd);
        } else {
            System.out.println("Таких элементов нет");
        }
    }
}
