package Command;

public class AddIfMinCommand extends CommandAbstract{

    public AddIfMinCommand(String name, String description) {
        super(name, description);
    }

    public void execute(String arg) {
        System.out.println("add if min");;
    }
}
