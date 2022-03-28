package Command;

import Data.Movie;

import java.util.LinkedHashSet;

public class Receiver {

    public Receiver(){
    }

    public void execute(CommandAbstract command,String arg,  LinkedHashSet<Movie> collectionForWork){
        command.execute(arg, collectionForWork);
    }
}
