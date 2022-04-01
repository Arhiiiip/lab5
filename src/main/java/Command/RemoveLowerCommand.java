package Command;

import Data.Movie;
import utility.MovieFactory;

import java.util.LinkedHashSet;

public class RemoveLowerCommand extends CommandAbstract{

    MovieFactory movieFactory;

    public RemoveLowerCommand(String name, String description, MovieFactory movieFactory) {
        super(name, description);
        this.movieFactory = movieFactory;
    }

    public void execute(String arg) {
        long oscarsCountFromUser = Integer.valueOf(arg);
        LinkedHashSet<Movie> collectionForRemove = new LinkedHashSet<Movie>();
        boolean isElements = false;
        for (Movie movie : movieFactory.getCollectionForWork()){
            if (movie.getOscarsCount() < oscarsCountFromUser){
                collectionForRemove.add(movie);
                isElements = true;
            }
        }
        if(isElements){
            movieFactory.getCollectionForWork().removeAll(collectionForRemove);
            movieFactory.getCollectionManager().setDateUpdate();
        }else{
            System.out.println("Таких элементов нет");
        }
    }
}
