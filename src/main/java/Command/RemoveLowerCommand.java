package Command;

public class RemoveLowerCommand extends CommandAbstract{

    public RemoveLowerCommand(String name, String description) {
        super(name, description);
    }

    public void execute(String arg) {
        System.out.println("remove lower");
    }
}
