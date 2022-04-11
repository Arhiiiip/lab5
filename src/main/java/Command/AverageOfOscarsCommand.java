package Command;

import Data.Movie;
import utility.MovieFactory;

public class AverageOfOscarsCommand extends CommandAbstract{

    MovieFactory movieFactory;

    public AverageOfOscarsCommand(String name, String description, MovieFactory movieFactory, boolean isArgument) {
        super(name, description, isArgument);
        this.movieFactory = movieFactory;
    }

    public void execute(String arg) {
        int sum = 0;
        for (Movie movie: movieFactory.getCollectionForWork()){
            sum = sum + movie.getOscarsCount();
        }
        System.out.println(sum/movieFactory.getCollectionForWork().size());
    }
}
