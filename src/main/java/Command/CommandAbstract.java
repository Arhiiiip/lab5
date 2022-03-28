package Command;

import Data.Movie;

import java.util.LinkedHashSet;

public abstract class CommandAbstract {
    final String name;
    final String description;

    public CommandAbstract(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void execute(String arg, LinkedHashSet<Movie> collectionForWork) {
    }

    @Override
    public String toString() {
        return name + " - " + description;
    }
}
