package Command;

public class HelpCommand extends CommandAbstract{


    public HelpCommand(String name, String description) {
        super(name, description);
    }

    public void execute(String arg) {
        System.out.println();
    }
}
