package Command;

public class ShowCommand extends CommandAbstract{

    public ShowCommand(String name, String description) {
        super(name, description);
    }

    public void execute(String arg) {
        System.out.println("show");
    }
}
