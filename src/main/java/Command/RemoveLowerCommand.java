package Command;

import Data.Movie;

import java.util.LinkedHashSet;

public class RemoveLowerCommand extends CommandAbstract{

    public RemoveLowerCommand(String name, String description) {
        super(name, description);
    }
//TODO remove lower
    public void execute(String arg, LinkedHashSet<Movie> collectionForWork) {
        long oscarsCountFromUser = Integer.valueOf(arg);
        LinkedHashSet<Movie> collectionForRemove = new LinkedHashSet<Movie>();
        boolean isElements = false;
        for (Movie movie : collectionForWork){
            if (movie.getOscarsCount() < oscarsCountFromUser){
                collectionForRemove.add(movie);
                isElements = true;
            }
        }
        if(isElements){
            collectionForWork.removeAll(collectionForRemove);
        }else{
            System.out.println("Таких элементов нет");
        }
    }
}
