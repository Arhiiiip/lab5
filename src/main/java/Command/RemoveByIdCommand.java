package Command;

import Data.Movie;
import utility.MovieFactory;

import java.util.LinkedHashSet;

public class RemoveByIdCommand extends CommandAbstract{
    
    private final MovieFactory movieFactory;

    public RemoveByIdCommand(String name, String description, MovieFactory movieFactory) {
        super(name, description);
        this.movieFactory = movieFactory;
    }
//TODO remove by id
     public void execute(String arg, LinkedHashSet<Movie> collectionForWork) {
        long idFromUser = Long.valueOf(arg);
        boolean isId = false;
        for (Movie movie : collectionForWork){
            if (movie.getId() == idFromUser){
                collectionForWork.remove(movie);
                isId = true;
                break;
            }
        }
         if(!isId){
             System.out.println("Такого айди нет");
         }
     }
}
