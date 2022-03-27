package Command;

import utility.MovieFactory;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Invoker {
private Map<String, CommandAbstract> commands;
private Receiver receiver;

    public Invoker(LinkedHashSet collectionForWork, Receiver receiver, MovieFactory movieFactory) {
        commands = new HashMap<>();
        this.receiver = receiver;
        initCommands(movieFactory);
    }

    public void initCommands(MovieFactory movieFactory){
        commands.put("add", new AddCommand("add", "ХУй даавяет в ЖоПу", movieFactory));
    }

    public void execute(String name, LinkedHashSet collectionFotWork){
        if (commands.containsKey(name)) {
            receiver.execute(commands.get(name), collectionFotWork);
        } else {
            System.out.println("Input is incorrect.");
        }
    }
}
