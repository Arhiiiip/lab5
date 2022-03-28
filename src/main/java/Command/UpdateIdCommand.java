package Command;

public class UpdateIdCommand extends CommandAbstract{

    public UpdateIdCommand(String name, String description) {
        super(name, description);
    }
//TODO update id
    public void execute(String arg) {
        System.out.println("update id");
    }

}
