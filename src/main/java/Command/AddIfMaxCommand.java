package Command;

public class AddIfMaxCommand extends CommandAbstract{

    public AddIfMaxCommand(String name, String description) {
        super(name, description);
    }

    public void execute(String arg) {
        System.out.println("add if max");;
    }
}
