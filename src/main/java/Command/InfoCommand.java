package Command;

public class InfoCommand extends CommandAbstract{


    public InfoCommand(String name, String description) {
        super(name, description);
    }

    public void execute(String arg) {
        System.out.println("info");
    }
}
