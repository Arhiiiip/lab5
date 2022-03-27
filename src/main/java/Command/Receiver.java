package Command;

import java.util.LinkedHashSet;

public class Receiver {

    public Receiver(){
    }

    public void execute(CommandAbstract command, LinkedHashSet collectionForWork){
        command.execute(collectionForWork);
    }
}
