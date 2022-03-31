package Command;

import utility.MovieFactory;

public class ExitCommand extends CommandAbstract{

    MovieFactory movieFactory;
    boolean temp;

    public ExitCommand(String name, String description, MovieFactory movieFactory, boolean temp) {
        super(name, description);
        this.temp = temp;
        this.movieFactory = movieFactory;
    }
//TODO работает, но надо ещё закрывать процессы.
    public void execute(String arg) {
        temp = false;
        System.exit(0);
    }
}
