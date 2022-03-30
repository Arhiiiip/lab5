package Command;

import Data.Movie;
import utility.MovieFactory;

public class RemoveByIdCommand extends CommandAbstract{
    
    private final MovieFactory movieFactory;

    public RemoveByIdCommand(String name, String description, MovieFactory movieFactory) {
        super(name, description);
        this.movieFactory = movieFactory;
    }
//TODO remove by id
     public void execute(String arg) {
        long idFromUser = Long.valueOf(arg);
        boolean isId = false;
        for (Movie movie : movieFactory.getCollectionForWork()){
            if (movie.getId() == idFromUser){
                movieFactory.getCollectionForWork().remove(movie);
                isId = true;
                break;
            }
        }
         if(!isId){
             System.out.println("Такого айди нет");
         }
     }
}
