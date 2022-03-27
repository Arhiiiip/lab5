package Command;

public class ExitCommand extends CommandAbstract{

    public ExitCommand(String name, String description) {
        super(name, description);
    }

    public void execute(String arg) {
        System.out.println("exit");
    }
}
