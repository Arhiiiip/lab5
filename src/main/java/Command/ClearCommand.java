package Command;

import utility.MovieFactory;

public class ClearCommand extends CommandAbstract{

    MovieFactory movieFactory;

    public ClearCommand(String name, String description, MovieFactory movieFactory) {
        super(name, description);
        this.movieFactory = movieFactory;
    }

    public void execute(String arg) {
        movieFactory.getCollectionForWork().clear();
    }
}
