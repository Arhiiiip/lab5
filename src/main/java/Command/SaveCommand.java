package Command;

public class SaveCommand extends CommandAbstract{

    public SaveCommand(String name, String description) {
        super(name, description);
    }
//TODO save
    public void execute(String arg) {
        System.out.println("save");
    }
}
