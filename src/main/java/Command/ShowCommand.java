package Command;

import Data.Movie;

import java.util.LinkedHashSet;

public class ShowCommand extends CommandAbstract {

    public ShowCommand(String name, String description) {
        super(name, description);
    }

    public void execute(String arg, LinkedHashSet<Movie> collectionForWork) {
        Object[] array = collectionForWork.toArray();
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
