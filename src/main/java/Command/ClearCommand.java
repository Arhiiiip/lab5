package Command;

import Data.Movie;

import java.util.LinkedHashSet;

public class ClearCommand extends CommandAbstract{


    public ClearCommand(String name, String description) {
        super(name, description);
    }

    public void execute(String arg, LinkedHashSet<Movie> collectionForWork) {
        collectionForWork.clear();
    }
}
