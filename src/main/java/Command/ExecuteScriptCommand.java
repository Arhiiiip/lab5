package Command;

public class ExecuteScriptCommand extends CommandAbstract{


    public ExecuteScriptCommand(String name, String description) {
        super(name, description);
    }

    public void execute(String arg) {
        System.out.println("execute script");
    }
}
