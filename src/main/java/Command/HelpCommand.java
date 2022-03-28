package Command;

import Data.Movie;

import java.util.LinkedHashSet;
import java.util.Map;

public class HelpCommand extends CommandAbstract{
    private Map<String, CommandAbstract> commands;

    public HelpCommand(String name, String description,Map<String, CommandAbstract> commands) {
        super(name, description);
        this.commands = commands;
    }

//TODO HELP command
    public void execute(String arg, LinkedHashSet<Movie> collectionForWork) {
        for (Map.Entry<String, CommandAbstract> entry : commands.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }
}
