package Command;

import Data.Movie;
import utility.MovieFactory;

public class AverageOfOscarsCommand extends CommandAbstract{

    MovieFactory movieFactory;

    public AverageOfOscarsCommand(String name, String description, MovieFactory movieFactory) {
        super(name, description);
        this.movieFactory = movieFactory;
    }

    public void execute(String arg) {
        int sum = 0;
        float average;
        for (Movie movie: movieFactory.getCollectionForWork()){
            sum = sum + movie.getOscarsCount();
        }
        average = sum/movieFactory.getCollectionForWork().size();
        System.out.println(average);
        System.out.println(sum/movieFactory.getCollectionForWork().size());
    }
}
