package Command;

public class RemoveByIdCommand extends CommandAbstract{


    public RemoveByIdCommand(String name, String description) {
        super(name, description);
    }

    public void execute(String arg) {
        System.out.println("remove by id");
    }
}
