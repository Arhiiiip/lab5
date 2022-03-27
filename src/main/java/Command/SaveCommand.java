package Command;

public class SaveCommand extends CommandAbstract{

    public SaveCommand(String name, String description) {
        super(name, description);
    }

    public void execute(String arg) {
        System.out.println("save");
    }
}
