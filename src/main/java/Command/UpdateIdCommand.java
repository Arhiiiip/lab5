package Command;

public class UpdateIdCommand extends CommandAbstract{

    public UpdateIdCommand(String name, String description) {
        super(name, description);
    }

    public void execute(String arg) {
        System.out.println("update id");
    }

}
